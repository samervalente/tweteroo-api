package com.aceleracaojavav2.tweteroo.dtos;


import jakarta.validation.constraints.NotBlank;

public record UserDTO(
    
@NotBlank
String username, 


@NotBlank
String avatar


){}