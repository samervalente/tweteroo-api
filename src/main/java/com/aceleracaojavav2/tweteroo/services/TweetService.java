package com.aceleracaojavav2.tweteroo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.aceleracaojavav2.tweteroo.dtos.TweetDTO;
import com.aceleracaojavav2.tweteroo.exceptions.NotFoundException;
import com.aceleracaojavav2.tweteroo.models.Tweet;
import com.aceleracaojavav2.tweteroo.models.Usuario;
import com.aceleracaojavav2.tweteroo.repositories.TweetRepository;
import com.aceleracaojavav2.tweteroo.repositories.MongoUsuarioRepository;

@Service
public class TweetService {
    
    @Autowired
    private TweetRepository tweetRepository;

    @Autowired
    private MongoUsuarioRepository userRepository;

    public Tweet create(TweetDTO tweetData){
        Usuario usuario = userRepository.findByName(tweetData.username());
        if(usuario == null){
            throw new NotFoundException("Usuário não encontrado.");
        }

        Tweet createdTweet = tweetRepository.save(new Tweet(tweetData, usuario.getAvatar()));
        return createdTweet;
    }

    public List<Tweet> getAll(Integer page){
        Pageable elements = PageRequest.of(page, 5);//page, size
        Page<Tweet> tweetsByPage = tweetRepository.findAll(elements);
        return tweetsByPage.getContent();
    }

    public List<Tweet> getTweetsByUsername(String username){
        Usuario usuario = userRepository.findByName(username);
        if(usuario == null){
            throw new NotFoundException("Usuário não encontrado.");
        }
        return tweetRepository.findByUsername(username);
    }

   
}
