package com.subrutin.service.impl;

import com.subrutin.domain.Author;
import com.subrutin.domain.Book;
import com.subrutin.dto.BookDetailDTO;
import com.subrutin.repository.BookRepository;
import com.subrutin.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("bookService")
public class BookServiceImpl implements BookService {

    private Book book;

    private BookRepository bookRepository;

////    public BookServiceImpl(Book book) { // tidak perlu lagi param book lagi
//    public BookServiceImpl() {
////        this.book = book;
//        Author author = new Author();
//        book = new Book(author);
//    }

    @Autowired
    public BookServiceImpl(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public BookDetailDTO findBookDetailById(Long bookId) {
        Book book = bookRepository.findBookById(bookId);
        BookDetailDTO dto = new BookDetailDTO();
        dto.setBookId(book.getId());
        dto.setAuthorName(book.getAuthor().getName());
        dto.setBookTitle(book.getTitle());
        dto.setBookDescription(book.getDescription());
        return dto;
    }

//    public BookRepository getBookRepository() {
//        return bookRepository;
//    }
//
//    public void setBookRepository(BookRepository bookRepository) {
//        this.bookRepository = bookRepository;
//    }

}
