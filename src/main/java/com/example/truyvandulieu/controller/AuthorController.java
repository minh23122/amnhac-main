package com.example.truyvandulieu.controller;

import com.example.truyvandulieu.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/authors")
public class AuthorController {
    @Autowired
    private AuthorService authorService;
    @GetMapping("/mostpost")
    public List<Object[]> findAuthorsWithMostPost(){
        return authorService.findAuthorsWithMostPosts();
    }

}
