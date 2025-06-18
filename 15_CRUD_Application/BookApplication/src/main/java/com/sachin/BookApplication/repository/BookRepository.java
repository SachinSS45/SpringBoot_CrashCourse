package com.sachin.BookApplication.repository;

import com.sachin.BookApplication.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface BookRepository extends JpaRepository<Book,Integer> {

    Book findBookByTitle(String title);
}
