package com.sachin.springDemo.DTO;

import com.sachin.springDemo.entity.Employee;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class EmployeeDTO {
    String name;
    String dept;
    Integer age;

    public EmployeeDTO employeeMapper(Employee employee){
        this.setName(employee.getName());
        this.setDept(employee.getDept());
        this.setAge(employee.getAge());
        return this;
    }
}
