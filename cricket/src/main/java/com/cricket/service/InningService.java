package com.cricket.service;

import com.cricket.model.Inning;
import com.cricket.repo.InningRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InningService {
    @Autowired
    InningRepo inningRepo;

    public void saveInning(Inning inning) {
        inningRepo.save(inning);
    }
}
