package com.sachin.BookApplication.service;

import com.sachin.BookApplication.entity.Book;
import com.sachin.BookApplication.exception.BookNotFoundException;
import com.sachin.BookApplication.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {
    @Autowired
    BookRepository bookRepository;

    public Book addBook(Book book) {
        return bookRepository.save(book);
    }

    public Book getBookByName(String name) {
        Book book = bookRepository.findBookByTitle(name);
        return book;
    }
    //save method value update if id is already present else it will work as post
    public Book updateBook(Book book) {
       return bookRepository.save(book);
    }

    public void deleteBook(Integer id) {
        bookRepository.deleteById(id);
    }
}
