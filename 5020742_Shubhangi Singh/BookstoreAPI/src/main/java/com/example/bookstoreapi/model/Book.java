package com.example.bookstoreapi.model;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Book {

    @Id
    @GeneratedValue
    private Long id;

    @NotNull
    @Size(min = 1, max = 255)
    private String title;

    @NotNull
    @Size(min = 1, max = 255)
    private String author;

    @Min()
    private double price;

    @Size(min = 10, max = 13)
    private String isbn;

    @Version
    private Integer version;

}
