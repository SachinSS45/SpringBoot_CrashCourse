package com.sachin.ecom.service;

public class CreditCardService implements PaymentService{
    @Override
    public void processPayment(double amount) {
        System.out.println("Credit card payment being processed");
    }
}
