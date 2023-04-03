package com.aceleracaojavav2.tweteroo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aceleracaojavav2.tweteroo.models.Tweet;

public interface TweetRepository extends JpaRepository<Tweet, Long> {
    
}
