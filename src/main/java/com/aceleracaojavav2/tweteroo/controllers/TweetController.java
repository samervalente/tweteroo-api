package com.aceleracaojavav2.tweteroo.controllers;

import java.util.List;

import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aceleracaojavav2.tweteroo.dtos.TweetDTO;
import com.aceleracaojavav2.tweteroo.models.Tweet;
import com.aceleracaojavav2.tweteroo.services.TweetService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/tweets")
public class TweetController {
    
    @Autowired
    private TweetService tweetService;

    @PostMapping
    public ResponseEntity<Tweet> create(@RequestBody @Valid TweetDTO tweetData){
            Tweet tweet = tweetService.create(tweetData);
            return new ResponseEntity<>(tweet, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<Tweet>> listAll(){
        List<Tweet> tweets = tweetService.getAll();
        return new ResponseEntity<>(tweets, HttpStatus.OK);
    }
}   
