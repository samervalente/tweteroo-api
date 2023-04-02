package com.aceleracaojavav2.tweteroo.models;


import com.aceleracaojavav2.tweteroo.dtos.TweetDTO;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class Tweet {
    
    public Tweet(TweetDTO tweetData){
        this.username = tweetData.username();
        this.avatar = tweetData.avatar();
        this.text = tweetData.text();
    }
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO )
    private Long id;

   
    @Column(length = 50, nullable = false)
    String username;

    @Column(nullable = false)
    String avatar;

    @Column(length=200, nullable = false)
    String text;

}
