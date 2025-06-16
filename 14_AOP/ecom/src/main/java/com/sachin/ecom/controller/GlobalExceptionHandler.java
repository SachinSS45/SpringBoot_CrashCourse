package com.sachin.ecom.controller;

import com.sachin.ecom.Entity.ErrorResponse;
import com.sachin.ecom.exceptions.ProductNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.time.LocalDateTime;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(ProductNotFoundException.class)
    public ResponseEntity<?> handleProductNotFoundException(ProductNotFoundException exception){
        ErrorResponse productNotFound = new ErrorResponse(LocalDateTime.now(),exception.getMessage(),"Product Not Found");
        return new ResponseEntity<>(productNotFound, HttpStatus.NOT_FOUND);
    }


}
