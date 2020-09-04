package com.cricket.controller;

import com.cricket.model.Inning;
import com.cricket.service.InningService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/inning")
public class InningController {

    @Autowired
    InningService inningService;

    @PostMapping()
    public void saveInning(@RequestBody Inning inning) {
        inningService.saveInning(inning);
    }
}
