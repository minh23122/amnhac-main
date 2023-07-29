package com.example.truyvandulieu.service;

import com.example.truyvandulieu.repository.GenreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class GenreService {
    @Autowired
    private GenreRepository genreRepository;
    public List<Object[]> getGenredontHavePost(){
        return genreRepository.getGenresdonthavePost();
    }
    public List<Object[]> getGenreHaveMaxPost(){
        return genreRepository.getGenreHaveMaxPost();
    }
}
