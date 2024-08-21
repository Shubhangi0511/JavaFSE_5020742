package com.example.bookstoreapi.repository;

import com.example.bookstoreapi.model.Book;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
    Book findById(Long id);

    List<Book> findAll();
    // You can define custom queries here if needed
}
