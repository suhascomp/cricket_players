package com.cricket.repo;

import com.cricket.model.Inning;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InningRepo extends JpaRepository<Inning, Integer> {
}
