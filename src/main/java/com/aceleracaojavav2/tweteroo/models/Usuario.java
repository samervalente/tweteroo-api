package com.aceleracaojavav2.tweteroo.models;


import org.springframework.data.mongodb.core.mapping.Document;

import com.aceleracaojavav2.tweteroo.dtos.UserDTO;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Document("users")
@NoArgsConstructor
public class Usuario {
    
    public Usuario (UserDTO userData){
        this.name = userData.name();
        this.avatar = userData.avatar();
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;

    @Column(length = 50, nullable = false)
    private String name;

    @Column(nullable = false)
    private String avatar;
   
}
