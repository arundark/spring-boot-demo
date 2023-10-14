package com.dailycodebuffer.springbootdemo.service;

import com.dailycodebuffer.springbootdemo.error.EmployeeNotFoundException;
import com.dailycodebuffer.springbootdemo.model.Employee;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    List<Employee> employees = new ArrayList<>();

    @Override
    public Employee save(Employee employee) {
        if (employee.getEmployeeId() == null
                || employee.getEmailId().isEmpty()) {

            employee.setEmployeeId(UUID.randomUUID().toString());
        }
        employees.add(employee);
        return employee;
    }

    @Override
    public List<Employee> getAllEmployes() {
        return employees;
    }

    @Override
    public Employee getEmployeeById(String id) {

        return employees.stream()
                .filter(employee
                        -> employee.getEmployeeId().equals(id))
                .findFirst()
                .orElseThrow(() -> new EmployeeNotFoundException("" +
                        "Employee not found with id: " + id));
    }
}
