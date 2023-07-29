package com.example.truyvandulieu.repository;

import com.example.truyvandulieu.model.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface AuthorRepository extends JpaRepository<Author,Integer> {
    @Query("select a from Post p join p.author a group by a.id order by count (p.id) desc limit 2")
    public List<Object[]> findAuthorsWithMostPosts();
}
