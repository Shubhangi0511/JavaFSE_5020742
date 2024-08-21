package com.example.bookstoreapi.controller;

import com.example.bookstoreapi.repository.bookrepo;

public class BookServiceBuilder {
    private bookrepo bookRepository;

    public BookServiceBuilder setBookRepository(bookrepo bookRepository) {
        this.bookRepository = bookRepository;
        return this;
    }

    public BookService createBookService() {
        return new BookService(bookRepository);
    }
}