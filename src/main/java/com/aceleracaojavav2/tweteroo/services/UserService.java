package com.aceleracaojavav2.tweteroo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import com.aceleracaojavav2.tweteroo.dtos.UserDTO;
import com.aceleracaojavav2.tweteroo.models.Usuario;
import com.aceleracaojavav2.tweteroo.repositories.UserRepository;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public void create(UserDTO userData){
        userRepository.save(new Usuario(userData));
    }

    public List<Usuario> listAll(){
        return userRepository.findAll();
    }

}
