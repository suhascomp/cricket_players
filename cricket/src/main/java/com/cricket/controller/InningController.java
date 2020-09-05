package com.cricket.controller;

import com.cricket.model.Inning;
import com.cricket.service.InningService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/inning")
public class InningController {

    @Autowired
    InningService inningService;

    @PostMapping("/save")
    public void saveInning(@RequestBody Inning inning) {
        inningService.saveInning(inning);
    }

    @GetMapping("/all-innings")
    public List<Inning> getAllInnings() {
        return inningService.getAllInnings();
    }

    @PutMapping("/update")
    public void updateInning(@RequestBody Inning inning) {
        inningService.updateInning(inning);
    }

    @DeleteMapping("/{id}")
    public void deleteInningById(@PathVariable int id) {
        inningService.deleteInningById(id);
    }

    @GetMapping("/{id}")
    public Inning getInningById(@PathVariable int id) {
        return inningService.getInningById(id);
    }
}
