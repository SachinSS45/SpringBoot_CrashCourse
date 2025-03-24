package com.sachin.springDemo.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
public class Employee {

    @Id //Primary Key in table
    Integer id;
    String name;
    String dept;
    Integer age;

    public Employee() {
    }

    public Employee(Integer id, String name, String dept, Integer age) {
        this.id = id;
        this.name = name;
        this.dept = dept;
        this.age = age;
    }

}
