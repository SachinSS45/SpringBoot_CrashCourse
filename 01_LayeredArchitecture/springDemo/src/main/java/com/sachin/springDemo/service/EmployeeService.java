package com.sachin.springDemo.service;

import com.sachin.springDemo.DTO.EmployeeDTO;
import com.sachin.springDemo.entity.Employee;
import com.sachin.springDemo.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;
    public EmployeeDTO getEmployee(Integer id){
       //business ops
        Employee employee = employeeRepository.getEmployee(id);
        EmployeeDTO employeeDTO = new EmployeeDTO();
        return employeeDTO.employeeMapper(employee);
    }
}
