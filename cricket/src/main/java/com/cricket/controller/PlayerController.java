package com.cricket.controller;

import com.cricket.model.Player;
import com.cricket.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/player")
public class PlayerController {

    @Autowired
    PlayerService playerService;

    @PostMapping()
    public void savePlayer(@RequestBody Player player) {
    playerService.savePlayer(player);
    }

    @GetMapping()
    public List<Player> getAllPlayers() {
        return playerService.getAllPlayer();
    }
}

