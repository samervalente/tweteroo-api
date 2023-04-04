package com.aceleracaojavav2.tweteroo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import com.aceleracaojavav2.tweteroo.dtos.UserDTO;
import com.aceleracaojavav2.tweteroo.exceptions.ConflictException;
import com.aceleracaojavav2.tweteroo.models.Usuario;
import com.aceleracaojavav2.tweteroo.repositories.MongoUsuarioRepository;


@Service
public class UserService {

    @Autowired
    private MongoUsuarioRepository mongoRepository;

    public Usuario create(UserDTO userData){
        Usuario usuario = mongoRepository.findByName(userData.name());
        if(usuario != null){
            throw new ConflictException("Usuário com nome já existente.");
        }
      
        return mongoRepository.insert(new Usuario(userData));
    }

    public List<Usuario> listAll(){
        return mongoRepository.findAll();
    }

}
