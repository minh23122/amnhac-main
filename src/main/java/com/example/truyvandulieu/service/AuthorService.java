package com.example.truyvandulieu.service;

import com.example.truyvandulieu.repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorService {
    @Autowired
    private AuthorRepository authorRepository;
    public List<Object[]> findAuthorsWithMostPosts(){
        return authorRepository.findAuthorsWithMostPosts();
    }

}
