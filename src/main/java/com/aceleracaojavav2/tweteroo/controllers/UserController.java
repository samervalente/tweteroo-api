package com.aceleracaojavav2.tweteroo.controllers;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aceleracaojavav2.tweteroo.dtos.UserDTO;
import com.aceleracaojavav2.tweteroo.models.Usuario;
import com.aceleracaojavav2.tweteroo.repositories.UserRepository;

import jakarta.validation.Valid;


@RestController
@RequestMapping("/signup")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @PostMapping
    public void create(@RequestBody @Valid UserDTO userData){
        userRepository.save(new Usuario(userData));
    }

    @GetMapping
    public List<Usuario> listAll(){
        List<Usuario> users = userRepository.findAll();
        return users;
    }
}
