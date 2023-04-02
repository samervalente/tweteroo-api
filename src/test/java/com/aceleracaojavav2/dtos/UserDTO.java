package com.aceleracaojavav2.dtos;

import java.net.URL;

import jakarta.validation.constraints.NotBlank;

public record UserDTO(
    
@NotBlank
String username, 


@NotBlank
URL avatar


){}