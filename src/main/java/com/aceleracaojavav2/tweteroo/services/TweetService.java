package com.aceleracaojavav2.tweteroo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aceleracaojavav2.tweteroo.dtos.TweetDTO;
import com.aceleracaojavav2.tweteroo.models.Tweet;
import com.aceleracaojavav2.tweteroo.repositories.TweetRepository;

@Service
public class TweetService {
    
    @Autowired
    private TweetRepository tweetRepository;

    public void create(TweetDTO tweetData){
        tweetRepository.save(new Tweet(tweetData, "fake_avatar"));
    }
}
