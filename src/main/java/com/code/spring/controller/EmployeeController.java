package com.code.spring.controller;

import com.code.spring.model.Employee;
import com.code.spring.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService employeeDao;


    @GetMapping("/get-all")
    public List<Employee> getAllEmployees() {
        return employeeDao.getAllEmployees();
    }

    @PostMapping("/save")
    public Employee save(@RequestBody Employee employee) {
        return  employeeDao.save(employee);
    }
}