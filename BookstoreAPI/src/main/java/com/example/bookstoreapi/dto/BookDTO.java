package com.example.bookstoreapi.dto;

import com.example.bookstoreapi.controller.ModelMapper;
import com.example.bookstoreapi.model.Book;

public class BookDTO extends Book {
    private Long id;
    private String title;
    private String author;
    private Double price;
    private String isbn;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public ModelMapper stream() {
        return null;
    }
}
