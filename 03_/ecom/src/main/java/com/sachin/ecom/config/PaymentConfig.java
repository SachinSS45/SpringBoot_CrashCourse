package com.sachin.ecom.config;

import com.sachin.ecom.service.CreditCardService;
import com.sachin.ecom.service.GPayService;
import com.sachin.ecom.service.PaymentService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PaymentConfig {

    @Bean
    public PaymentService creditCardPaymentService(){
        return new CreditCardService();
    }

    @Bean
    public PaymentService gpayPaymentService(){
        return new GPayService();
    }
}
