package com.example.truyvandulieu.service;

import com.example.truyvandulieu.model.Post;
import com.example.truyvandulieu.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
public class PostService {
    @Autowired
    private PostRepository postRepository;
    public List<Post> getAllPost(){
        return postRepository.findAll();
    }
    public List<Object[]> getPostByGenreName(String genreName){
        return postRepository.getPostByGenreName(genreName);
    }
    public List<Object[]> getPostByAuthorName(String author){
        return postRepository.getPostByAuthorName(author);
    }
    public List<Object[]> getAllPosts(){
        return postRepository.getAllPosts();
    }
    public List<Object[]> caug(String s){
        String[] keyword=s.split(" ");
        List<Object[]> list=new ArrayList<>();
        for(String s1:keyword){
            list.addAll(postRepository.caug(s1));
        }
        return list;
    }
    public Set<Object[]> cauh(String s){
        String[] keyword=s.split(" ");
        Set<Object[]> list=new HashSet<>();
        for(String s1:keyword){
            Set<Object[]> set=new HashSet<>();
            list.addAll(postRepository.cauh(s1));
        }
        return list;
    }

}
