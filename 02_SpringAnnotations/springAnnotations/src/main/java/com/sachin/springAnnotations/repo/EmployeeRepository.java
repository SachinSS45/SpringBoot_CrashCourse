package com.sachin.springAnnotations.repo;

import org.springframework.stereotype.Repository;

@Repository
public class EmployeeRepository {

    public String getEmployee(){
        //db operation - get employee from db
        return "employee";
    }
}
