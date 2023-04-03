package com.aceleracaojavav2.tweteroo.controllers;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
    public ResponseEntity<Usuario> create(@RequestBody @Valid UserDTO userData){
       Usuario user = userService.create(userData);
       return new ResponseEntity<>(user, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<Usuario>> listAll(){
         List<Usuario> usuarios = userService.listAll();
         return new ResponseEntity<>(usuarios, HttpStatus.OK);
    }
}
