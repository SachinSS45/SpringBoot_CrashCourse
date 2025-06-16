package com.sachin.ecom.controller;

import com.sachin.ecom.Entity.ErrorResponse;
import com.sachin.ecom.exceptions.ProductNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
public class OrderController {

    @GetMapping("/getOrderById/{id}")
    public ResponseEntity<?> getOrderById(@PathVariable("id") Integer orderId){
        throw  new ProductNotFoundException("Product for order is not found for id : " + orderId);
    }

}
