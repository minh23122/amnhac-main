package com.example.truyvandulieu.controller;

import com.example.truyvandulieu.service.GenreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/genre")
public class GenreController {
    @Autowired
    private GenreService genreService;
//    tìm thể loại nhạc không có bài viết
    @GetMapping("/notpost")
    public List<Object[]> getGenredontHavePost(){
        return genreService.getGenredontHavePost();
    }
//    theer loại có nhiều bài viết nhất
    @GetMapping("/maxpost")
    public List<Object[]> getGenreHaveMaxPost(){
        return genreService.getGenreHaveMaxPost();
    }
}
