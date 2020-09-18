package com.cricket.service;

import com.cricket.model.AppUser;
import com.cricket.model.UserSecurityDetails;
import com.cricket.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Optional;

@Service
public class UserSecurityService implements UserDetailsService {

    @Autowired
    UserRepo userRepo;

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        Optional<AppUser> appUser = userRepo.findByEmail(email);

        appUser.orElseThrow(()-> new UsernameNotFoundException("Not Found "+ email));

        return appUser.map(UserSecurityDetails::new).get();
    }
}
