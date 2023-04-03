package com.aceleracaojavav2.tweteroo.models;


import com.aceleracaojavav2.tweteroo.dtos.TweetDTO;

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
public class Tweet {
    
    public Tweet(TweetDTO tweetData, String avatar){
        this.username = tweetData.username();
        this.text = tweetData.tweet();
        this.avatar = avatar;
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
