package com.aceleracaojavav2.dtos;

import java.net.URL;

import jakarta.validation.constraints.NotBlank;

public record TweetDTO(

@NotBlank
String username, 

@NotBlank
URL avatar, 

@NotBlank
String text) {
    
}
