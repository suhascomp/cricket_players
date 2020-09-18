package com.cricket.repo;

import com.cricket.model.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepo extends JpaRepository<AppUser, Integer> {

    Optional<AppUser> findByEmail(String email);
}
