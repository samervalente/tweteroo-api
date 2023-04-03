package com.aceleracaojavav2.tweteroo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aceleracaojavav2.tweteroo.models.Usuario;

public interface UserRepository extends JpaRepository<Usuario, Long> {
    
}
