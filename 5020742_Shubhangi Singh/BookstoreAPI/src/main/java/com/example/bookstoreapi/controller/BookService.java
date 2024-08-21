package com.example.bookstoreapi.controller;

import com.example.bookstoreapi.model.Book;
import com.example.bookstoreapi.repository.bookrepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    private final bookrepo bookRepository;

    @Autowired
    public BookService(@Qualifier("bookrepo") bookrepo bookRepository) {
        this.bookRepository = bookRepository;
    }

    public Book getBookById(Long id) {
        return bookRepository.findById(id);
    }

    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }
}