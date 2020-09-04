package com.cricket.service;

import com.cricket.model.Player;
import com.cricket.repo.PlayerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlayerService {
    @Autowired
    PlayerRepo playerRepo;
    public void savePlayer(Player player) {
        playerRepo.save(player);
    }

    public List<Player> getAllPlayer() {
        return playerRepo.findAll();
    }
}
