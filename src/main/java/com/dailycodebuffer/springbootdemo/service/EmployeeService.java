package com.dailycodebuffer.springbootdemo.service;

import com.dailycodebuffer.springbootdemo.model.Employee;

import java.util.List;

public interface EmployeeService {
    Employee save(Employee employee);

    List<Employee> getAllEmployes();

    Employee getEmployeeById(String id);

    String deleteEmployeeById(String id);
}
