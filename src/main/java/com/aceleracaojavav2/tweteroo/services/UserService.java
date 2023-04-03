package com.aceleracaojavav2.tweteroo.services;

import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;

import com.aceleracaojavav2.tweteroo.dtos.UserDTO;
import com.aceleracaojavav2.tweteroo.exceptions.ConflictException;
import com.aceleracaojavav2.tweteroo.models.Tweet;
import com.aceleracaojavav2.tweteroo.models.Usuario;
import com.aceleracaojavav2.tweteroo.repositories.UserRepository;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public Usuario create(UserDTO userData){
        Usuario usuario = userRepository.findByName(userData.name());
        if(usuario != null){
            throw new ConflictException("Usuário com nome já existente.");
        }
      
        return userRepository.save(new Usuario(userData));
    }

    public List<Usuario> listAll(){
        return userRepository.findAll();
    }

}
