package com.sachin.springDemo.repository;

import com.sachin.springDemo.entity.Employee;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeRepository {

    public Employee getEmployee(Integer id){
        //DB operation,fetch the details for DB
        return new Employee(1,"Sachin","IT",24);

    }
}
