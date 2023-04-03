package com.aceleracaojavav2.tweteroo.dtos;

import jakarta.validation.constraints.NotBlank;

public record UserDTO(
    
@NotBlank 
String name,

@NotBlank 
String avatar
){}