package com.subrutin.repository.impl;

import com.subrutin.domain.Author;
import com.subrutin.domain.Book;
import com.subrutin.repository.BookRepository;

import java.util.HashMap;
import java.util.Map;

public class BookRepositoryImpl implements BookRepository {

//    hard data
    private Map<Long, Book> bookMap;

//    hard code
//    public BookRepositoryImpl() {
//        bookMap = new HashMap<Long, Book>();
//        Author author = new Author();
//        author.setId(1L);
//        author.setName("Pramudya Ananta Toer");
//        author.setBirthDate(-16401L);
////        book1.setAuthor(author); tidak perlu lagi
//
//        Book book1 = new Book(author);
//        book1.setId(1L);
//        book1.setTitle("Bumi Manusia");
//        book1.setDescription("Bumi Manusia adalah salah satu Novel karya Pramoedya Ananta Toer");
//
//
//        bookMap.put(book1.getId(), book1);
//
//    }

    @Override
    public Book findBookById(Long id) {
        Book book = bookMap.get(id);
        return book;
    }

    public Map<Long, Book> getBookMap() {
        return bookMap;
    }

    public void setBookMap(Map<Long, Book> bookMap) {
        this.bookMap = bookMap;
    }
}
