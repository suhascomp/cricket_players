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

    @PostMapping("/save-player")
    public void savePlayer(@RequestBody Player player) {
    playerService.savePlayer(player);
    }

    @GetMapping("/all-players-list")
    public List<Player> getAllPlayers() {
        return playerService.getAllPlayer();
    }

    @PutMapping("/update-player")
    public void updatePlayer(@RequestBody Player player) {
        playerService.updatePlayer(player);
    }

    @DeleteMapping("delete/{id}")
    public void deletePlayerById(@PathVariable int id) {
        playerService.deletePlayerById(id);
    }

    @GetMapping("player-by-id/{id}")
    public Player getPlayerById(@PathVariable int id) {
        return playerService.getPlayerById(id);
    }
}

