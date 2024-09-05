package com.bookstore.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Getter
@Setter
@Table(name = "books")
@NoArgsConstructor
@AllArgsConstructor
public class Book {

    @Id
    @Column(name = "book_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "book_title")
    private String title;

    @Column(name = "book_price")
    private Double price;

    @Column(name = "book_year")
    private Integer year;

    @ManyToMany(mappedBy = "books", fetch = FetchType.LAZY)
    private List<Author> authors;

    @ManyToMany(mappedBy = "books", fetch = FetchType.LAZY)
    private List<Category> categories;
}