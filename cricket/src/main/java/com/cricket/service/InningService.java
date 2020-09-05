package com.cricket.service;

import com.cricket.model.Inning;
import com.cricket.repo.InningRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InningService {
    @Autowired
    InningRepo inningRepo;

    public void saveInning(Inning inning) {
        inningRepo.save(inning);
    }

    public List<Inning> getAllInnings() {
        return inningRepo.findAll();
    }

    public void updateInning(Inning inning) {
        inningRepo.save(inning);
    }

    public void deleteInningById(int id) {
        inningRepo.deleteById(id);
    }

    public Inning getInningById(int id) {
        return inningRepo.findById(id).get();
    }
}
