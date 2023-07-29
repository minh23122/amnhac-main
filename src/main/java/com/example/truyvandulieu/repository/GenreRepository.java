package com.example.truyvandulieu.repository;

import com.example.truyvandulieu.model.Genre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface GenreRepository extends JpaRepository<Genre,Integer> {
    //    tìm thể loại nhạc không có bài viết
    @Query("select g from Post  p right join p.genre g group by g.id having count (p.id)=0")
    List<Object[]> getGenresdonthavePost();
    @Query("select g from Post p join  p.genre g group by g.id order by count (p.id) desc limit 1")
    List<Object[]> getGenreHaveMaxPost();
}
