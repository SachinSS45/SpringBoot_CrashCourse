package com.sachin.BookApplication.controller;

import com.sachin.BookApplication.entity.Book;
import com.sachin.BookApplication.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController //@Controller + @ResponseBody
@RequestMapping("book/v1") //endpoint
public class BookController {

    @Autowired
    BookService bookService;
    @PostMapping("/addBook")
    public ResponseEntity<Book> addBook(@RequestBody Book book){

        Book savedBook = bookService.addBook(book);
        return ResponseEntity.ok(savedBook);
    }

    @GetMapping("/getBook/{bookName}")
    public ResponseEntity<Book> getBookByName(@PathVariable("bookName") String name){
        Book book = bookService.getBookByName(name);
        return new ResponseEntity<>(book, HttpStatus.FOUND);
    }

    @PutMapping("/updateBook")
    public ResponseEntity<Book> updateBook(@RequestBody Book book){

        Book updatedBook = bookService.updateBook(book);
        return ResponseEntity.ok(updatedBook);
    }

    @DeleteMapping("/deleteBook/{id}")
    public ResponseEntity<Book> deleteBook(@PathVariable Integer id){

        bookService.deleteBook(id);
        return ResponseEntity.ok().build();
    }
}
