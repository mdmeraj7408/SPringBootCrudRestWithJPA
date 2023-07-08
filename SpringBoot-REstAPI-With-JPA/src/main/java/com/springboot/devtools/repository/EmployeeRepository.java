package com.springboot.devtools.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.springboot.devtools.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee,Long> {

}
