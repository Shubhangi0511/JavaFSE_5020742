package com.example.bookstoreapi.controller;

import com.example.bookstoreapi.dto.BookDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.CollectionModel;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/books")
public class BookController {

    @Autowired
    private BookService bookService;

    @GetMapping(value = "/{id}", produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
    public EntityModel<BookDTO> getBookById(@PathVariable Long id) {
        BookDTO book = (BookDTO) bookService.getBookById(id);

        EntityModel<BookDTO> resource = EntityModel.of(book);
        resource.add(WebMvcLinkBuilder.linkTo(
                WebMvcLinkBuilder.methodOn(BookController.class).getAllBooks()).withRel("all-books"));
        resource.add(WebMvcLinkBuilder.linkTo(
                WebMvcLinkBuilder.methodOn(BookController.class).getBookById(id)).withSelfRel());

        return resource;
    }

    @GetMapping(produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
    public CollectionModel<EntityModel<BookDTO>> getAllBooks() {
        List<EntityModel<BookDTO>> books = bookService.getAllBooks().stream()
                .map(book -> {
                    EntityModel<BookDTO> resource = EntityModel.of((BookDTO) book);
                    resource.add(WebMvcLinkBuilder.linkTo(
                            WebMvcLinkBuilder.methodOn(BookController.class).getBookById(book.getId())).withSelfRel());
                    return resource;
                })
                .collect(Collectors.toList());

        return CollectionModel.of(books);
    }
}
