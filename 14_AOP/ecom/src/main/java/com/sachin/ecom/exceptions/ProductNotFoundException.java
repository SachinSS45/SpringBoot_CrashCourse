package com.sachin.ecom.exceptions;



public class ProductNotFoundException extends RuntimeException{

    public ProductNotFoundException(String msg){
        super(msg);
    }
}
