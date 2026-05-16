package com.telusko.simpleWebApp.service;

import com.telusko.simpleWebApp.model.Users;
import com.telusko.simpleWebApp.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    public UserRepo repo;

    BCryptPasswordEncoder encoder = new BCryptPasswordEncoder(12);
    public Users register(Users user) {

        user.setPassword(encoder.encode(user.getPassword()));
        return repo.save(user);
    }
}
