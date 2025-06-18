package com.sachin.BookApplication.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity //to tell the spring framework this class table should be created
@Data // which contains @RequiredArgsConstructor : will generate constructor for final and non-null fields only
@NoArgsConstructor //it is needed for framework like JPA,Jackson for create object
@AllArgsConstructor //it will create all args constructor
public class Book {
        @Id // to mark a field as the primary key for entity class
        @GeneratedValue(strategy = GenerationType.IDENTITY) //the database will auto generate the ID value using AUTO_INCREMENT in MySQL
        private Integer id;
        private String title;
        private String author;
        private String genre;
}

