package com.aceleracaojavav2.models;

import java.net.URL;

import com.aceleracaojavav2.dtos.UserDTO;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
public class User {
    
    public User(UserDTO userData){
        this.username = userData.username();
        this.avatar = userData.avatar();
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(length = 50, nullable = false)
    String username;

    @Column(nullable = false)
    URL avatar;
   
}
