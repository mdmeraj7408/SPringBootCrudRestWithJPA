package com.springboot.devtools.service;

import java.util.List;

import com.springboot.devtools.model.Employee;

public interface EmployeeService {
List<Employee> getEmployee();

Employee saveEmployee(Employee employee); 
Employee getEmployeeByID(Long id);
void deleteEmployeeByID(Long Id);

Employee updateById(Employee emp);
}
