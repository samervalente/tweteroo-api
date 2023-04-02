package com.aceleracaojavav2.tweteroo.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aceleracaojavav2.tweteroo.dtos.UserDTO;
import com.aceleracaojavav2.tweteroo.models.User;

import jakarta.validation.Valid;


@RestController
@RequestMapping("/signup")
public class SignUpController {
    private List<User> users = new ArrayList<>();


    @PostMapping
    public User handle(@RequestBody @Valid UserDTO userData){
        User user = new User(userData);
        users.add(user);
        return user;
    }

    @GetMapping
    public List<User> listAll(){
        return users;
    }
}
