package com.dailycodebuffer.springbootdemo.service;

import com.dailycodebuffer.springbootdemo.entity.EmployeeEntity;
import com.dailycodebuffer.springbootdemo.model.Employee;
import com.dailycodebuffer.springbootdemo.repository.EmployeeRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class EmployeeV2ServiceImpl implements EmployeeService{

    @Autowired
    private EmployeeRepository employeeRepository;
    @Override
    public Employee save(Employee employee) {
        if (employee.getEmployeeId() == null
                || employee.getEmailId().isEmpty()) {

            employee.setEmployeeId(UUID.randomUUID().toString());
        }
        EmployeeEntity employeeEntity = new EmployeeEntity();
        BeanUtils.copyProperties(employee,employeeEntity);
        employeeRepository.save(employeeEntity);
        return employee;
    }

    @Override
    public List<Employee> getAllEmployes() {
        return null;
    }

    @Override
    public Employee getEmployeeById(String id) {
        return null;
    }

    @Override
    public String deleteEmployeeById(String id) {
        return null;
    }
}
