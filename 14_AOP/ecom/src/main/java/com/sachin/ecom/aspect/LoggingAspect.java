package com.sachin.ecom.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {

//    @Before("execution(* com.sachin.ecom.service.ProductService.addProduct(..))")
//    public void log(){
//        System.out.println("Aspect log called...");
//    } //simllary we can use @After also

    //Imp : @Around :

    @Around("execution(* com.sachin.ecom.service.ProductService.addProduct(..))")
    public Object log(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("Aspect log called..."); // we want to print this before the execution of addProduct method
        Object object = joinPoint.proceed();
        System.out.println("Aspect after log called"); //we want to print this after the execution of addProduct method
        return object;
    }
}
