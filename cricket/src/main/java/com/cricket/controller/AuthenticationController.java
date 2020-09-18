package com.cricket.controller;

import com.cricket.model.AppUser;
import com.cricket.model.AuthenticationResponse;
import com.cricket.service.UserSecurityService;
import com.cricket.util.JwtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class AuthenticationController {

    @Autowired
    AuthenticationManager authenticationManager;

    @Autowired
    UserSecurityService userSecurityService;

    @Autowired
    JwtUtil jwtUtil;

    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody AppUser appUser) throws Exception {
        try {
            authenticationManager.authenticate(
                    new UsernamePasswordAuthenticationToken(appUser.getEmail(), appUser.getPassword())
            );
        } catch (BadCredentialsException e) {
            throw new Exception("Incorrect email or password");
        }

       UserDetails userDetails = userSecurityService.loadUserByUsername(appUser.getEmail());
        appUser.setEmail(userDetails.getUsername());
        final String jwt = jwtUtil.generateToken(appUser);

        return ResponseEntity.ok(new AuthenticationResponse(jwt));

    }


    @GetMapping("/logout")
    public ResponseEntity<?> logout() throws Exception  {
        return ResponseEntity.ok("You successfully logout");
    }

    @PostMapping("/test/{appUser}")
    public ResponseEntity<?> testingPost(@PathVariable String appUser) {
        System.out.println("hello");
        return  ResponseEntity.ok(appUser);
    }
}
