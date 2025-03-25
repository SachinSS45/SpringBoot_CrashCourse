package com.sachin.springAnnotations.service;

import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    public String getEmployee(){
        return "employee";
    }
}
