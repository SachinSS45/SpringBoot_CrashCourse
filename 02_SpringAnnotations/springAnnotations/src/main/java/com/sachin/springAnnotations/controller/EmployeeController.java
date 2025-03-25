package com.sachin.springAnnotations.controller;

import com.sachin.springAnnotations.entity.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController //@Controller + @ResponseBody
public class EmployeeController {

//    @RequestMapping(path = "/getEmployee", method = RequestMethod.GET) // OR use @GetMapping("/getEmployee")
//    public String getEmployee(){
//        return "employee";
//    }
//
//    @RequestMapping(path = "/addEmployee",method = RequestMethod.POST)
//    public String addEmployee(Employee employee){
//        return "added";
//    }
//
//    @RequestMapping(path = "/updateEmployee",method = RequestMethod.PUT)
//    public String updateEmployee(Employee employee){
//        return "updated";
//    }
//
//    @RequestMapping(path = "/deleteEmployee",method = RequestMethod.DELETE)
//    public String deleteEmployee(Employee employee){
//        return "deleted";
//    }

    @GetMapping("/getEmployee")
    public String getEmployee(){
        return "employee";
    }

    @GetMapping("/getEmployeeById")
    public String getEmployeeById(@RequestParam Integer id){
        return "emp";
    }

    @GetMapping("/getEmpById/{id}")
    public String getEmpById(@PathVariable("id") Integer id){
        return "emp " + id;
    }
    @PostMapping("/addEmployee")
    public String addEmployee(@RequestBody Employee employee){
        return "added";
    }

    @PutMapping("/updateEmployee")
    public String updateEmployee(Employee employee){
        return "updated";
    }

    @DeleteMapping("/deleteMapping")
    public String deleteEmployee(Employee employee){
        return "deleted";
    }
}
