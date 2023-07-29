package com.example.truyvandulieu.model;

import jakarta.persistence.*;
import lombok.*;

import java.sql.Date;

@Entity
@Table(name = "baiviet")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ma_bviet")
    private int id;
    @Column(nullable = false, name = "tieude")
    private String title;
    @Column(nullable = false, name = "ten_bhat")
    private String songName;
    @ManyToOne
    @JoinColumn(
            name = "ma_tloai",
            referencedColumnName = "ma_tloai"

    )
    private Genre genre;
    @Column( name = "tomtat", length = 2000)
    private String summary;
    @Column(name = "noidung")
    private String content;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(
            name = "ma_tgia",
            referencedColumnName = "ma_tgia",
            nullable = false
    )
    private Author author;
    @Column(nullable = false, name = "ngayviet")
    private Date date;
    @Column(name = "hinhanh")
    private String hinhanh;


}
