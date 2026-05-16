package com.telusko.simpleWebApp.repository;

import com.telusko.simpleWebApp.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<Users, Integer> {

    Users findByUsername(String username);
}
