package com.code.spring.service;

import java.util.ArrayList;
import java.util.List;
import com.code.spring.model.Employee;
import com.code.spring.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.util.Streamable;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository repository;

    public Employee save(Employee employee) {
        return repository.save(employee);
    }

    public List<Employee> getAllEmployees() {
        List<Employee> employees = new ArrayList<>();
        Streamable.of(repository.findAll())
                .forEach(employees::add);
        return employees;
    }

    public void delete(int employeeId) {
        repository.deleteById(employeeId);
    }
}