package com.example.bookstoreapi.repository;


import com.example.bookstoreapi.model.Book;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface bookrepo extends JpaRepository<Book, Long> {
    // No implementation needed, Spring Data JPA will provide the implementation
}

