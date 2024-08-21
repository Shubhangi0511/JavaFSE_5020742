package com.example.bookstoreapi.controller;

import com.example.bookstoreapi.dto.BookDTO;
import com.example.bookstoreapi.model.Book;

public class ModelMapper {

    public BookDTO map(Book savedBook, Class<BookDTO> bookDTOClass) {
        if (bookDTOClass == BookDTO.class) {
            BookDTO bookDTO = new BookDTO();
            bookDTO.setId(savedBook.getId());
            bookDTO.setTitle(savedBook.getTitle());
            bookDTO.setAuthor(savedBook.getAuthor());
            bookDTO.setPrice(savedBook.getPrice());
            bookDTO.setIsbn(savedBook.getIsbn());
            return bookDTO;
        }
        return null;
    }

    public Book map(BookDTO bookDTO, Class<Book> bookClass) {
        if (bookClass == Book.class) {
            Book book = new Book();
            book.setId(bookDTO.getId());
            book.setTitle(bookDTO.getTitle());
            book.setAuthor(bookDTO.getAuthor());
            book.setPrice(bookDTO.getPrice());
            book.setIsbn(bookDTO.getIsbn());
            return book;
        }
        return null;
    }

    // Removed the incorrect method
}