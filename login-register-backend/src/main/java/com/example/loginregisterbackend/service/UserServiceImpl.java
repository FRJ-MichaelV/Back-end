package com.example.loginregisterbackend.service;

import com.example.loginregisterbackend.dto.UserRegistrationDto;
import com.example.loginregisterbackend.model.User;
import com.example.loginregisterbackend.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{
    private UserRepository userRepository;

    @Autowired
    private BCryptPasswordEncoder passwordEncoder;

    public UserServiceImpl(UserRepository userRepository) {
        super();
        this.userRepository = userRepository;
    }

    @Override
    public User save(UserRegistrationDto registrationDto){
        User user = new User(registrationDto.)
    }
}
