package com.aceleracaojavav2.tweteroo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

import com.aceleracaojavav2.tweteroo.models.Tweet;


public interface TweetRepository extends JpaRepository<Tweet, Long> {
    List<Tweet> findByUsername(String username);
}
