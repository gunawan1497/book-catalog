package com.subrutin.domain;

import java.io.Serializable;

public class Book implements Serializable {

    private Long id;

    private String title;

    private String description;

//    private Author author = new Author(); ini spring core dependency
    private Author author;

    public Book() {
    }

    public Book(Author author) {
        this.author = author;
    }

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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }
}
