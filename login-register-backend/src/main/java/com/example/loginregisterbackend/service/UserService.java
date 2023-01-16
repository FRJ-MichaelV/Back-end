package com.example.loginregisterbackend.service;

import com.example.loginregisterbackend.dto.UserRegistrationDto;
import com.example.loginregisterbackend.model.User;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.List;

public interface UserService extends UserDetailsService {
    User save(UserRegistrationDto registrationDto);
    List<User> getAll();
}
