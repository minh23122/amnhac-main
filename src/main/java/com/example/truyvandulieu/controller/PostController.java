package com.example.truyvandulieu.controller;

import com.example.truyvandulieu.model.Post;
import com.example.truyvandulieu.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Set;

@RestController
@RequestMapping("/api/posts")
public class PostController {
    @Autowired
    private PostService postService;
    @GetMapping
    public List<Post> getAllPost(){
        return postService.getAllPost();
    }
    @GetMapping("/genre/{genreName}")
    public List<Object[]> getPostByGenreName(@PathVariable String genreName){
        return postService.getPostByGenreName(genreName);
    }
    //http://localhost:8080/api/posts/genre/Nh%E1%BA%A1c%20tr%E1%BB%AF%20t%C3%ACnh
//    lấy các post có thể loại là nhac trữ tình
    @GetMapping("/author/{authorName}")
    public List<Object[]> getPostByAuthorName(@PathVariable String authorName){
        return postService.getPostByAuthorName(authorName);
//        http://localhost:8080/api/posts/author/Nhacvietplus
//        Các post có tác giả nhạc vietplus.
//        @GetMapping("/allpost")
//                public
    }
    @GetMapping("/all")
    public  List<Object[]> getAllPosts(){
        return postService.getAllPosts();
    }
//    http://localhost:8080/api/post/gs/song/yeu%20thuong%20anh%20em
    @GetMapping("/song/g/{keyword}")
    public Set<Post> getPosthaveSongkeys(@PathVariable String keyword){
        return postService.caug(keyword);
    }
    @GetMapping("/song/h/{keyword}")
    public Set<Post> getPosthaveSongOrTitlekeys(@PathVariable String keyword){
        return postService.cauh(keyword);
    }
}
