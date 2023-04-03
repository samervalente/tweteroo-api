package com.aceleracaojavav2.tweteroo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException.Conflict;

import java.util.List;

import com.aceleracaojavav2.tweteroo.dtos.UserDTO;
import com.aceleracaojavav2.tweteroo.exceptions.ConflictException;
import com.aceleracaojavav2.tweteroo.models.Usuario;
import com.aceleracaojavav2.tweteroo.repositories.UserRepository;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public void create(UserDTO userData){
        Usuario usuario = userRepository.findByName(userData.name());
        if(usuario != null){
            throw new ConflictException("Usuário com nome já existente.");
        }
      
        userRepository.save(new Usuario(userData));
    }

    public List<Usuario> listAll(){
        return userRepository.findAll();
    }

}
