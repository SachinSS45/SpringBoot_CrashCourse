package com.sachin.ecom.service;

public class GPayService implements PaymentService{
    @Override
    public void processPayment(double amount) {
        System.out.println("Gpay Payment processing");
    }
}
