package com.vaibhav.practice.userservice.service;

import com.vaibhav.practice.userservice.model.User;
import org.springframework.stereotype.Component;

@Component
public class UserService {

    public void addUser(User user) {
        System.out.println("User added");
    }
}
