package com.example.truyvandulieu.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "tacgia")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ma_tgia")
    private int id;
    @Column(name = "ten_tgia",nullable = false)
    private String name;
    @Column(name = "hinhanh")
    private String image;

}
