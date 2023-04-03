package com.aceleracaojavav2.tweteroo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aceleracaojavav2.tweteroo.dtos.TweetDTO;


import jakarta.validation.Valid;

@RestController
@RequestMapping("/tweets")
public class TweetController {
    
    //@Autowired
    //private TweetService tweetService;

    public void create(@RequestBody @Valid TweetDTO tweetData){
        System.out.println("Ok");
    }
}   
