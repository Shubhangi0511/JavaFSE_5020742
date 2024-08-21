package com.example.bookstoreapi.repository;

import com.example.bookstoreapi.model.Book;

import java.util.List;

public interface JpaRepository<T, T1> {
    List<Book> findAll();

    Book findById(Long id);
}
