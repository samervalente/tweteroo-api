package com.aceleracaojavav2.tweteroo.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.aceleracaojavav2.tweteroo.models.Usuario;

public interface MongoUsuarioRepository extends MongoRepository<Usuario, Long> {
    Usuario findByName(String name);
}
