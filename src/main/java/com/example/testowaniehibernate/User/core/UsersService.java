package com.example.testowaniehibernate.User.core;

import com.example.testowaniehibernate.User.domain.UserRepository;
import com.example.testowaniehibernate.User.domain.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UsersService {
    @Autowired
    private UserRepository userRepository;

    public void addUser(Users users){
        userRepository.save(users);
    }
    public Optional<Users> findById(Long id){
        return userRepository.findById(id);
    }
}
