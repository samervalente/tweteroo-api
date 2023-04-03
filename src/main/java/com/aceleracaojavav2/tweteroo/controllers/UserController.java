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
import com.aceleracaojavav2.tweteroo.services.UserService;

import jakarta.validation.Valid;


@RestController
@RequestMapping("/signup")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping
    public String create(@RequestBody @Valid UserDTO userData){
        userService.create(userData);
        return "Ok";
    }

    @GetMapping
    public List<Usuario> listAll(){
        return  userService.listAll();
    }
}
