package com.springboot.devtools.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.devtools.model.Employee;
import com.springboot.devtools.repository.EmployeeRepository;
@Service
public class EmployeeServiceImpl implements EmployeeService {
  @Autowired
	private EmployeeRepository repository;
  
	public List<Employee> getEmployee() {
		
		return repository.findAll();
	}

	@Override
	public Employee saveEmployee(Employee employee) {
		Employee employee2 = repository.save(employee);
		return employee2;
	}

	@Override
	public Employee getEmployeeByID(Long id) {
		Optional<Employee> byId = repository.findById(id);
		if(byId.isPresent())
		{
			return byId.get();
		}
		throw new RuntimeException("Employee Is Not Found By The Id:"+id);
		
	}

	@Override
	public void deleteEmployeeByID(Long Id) {
          repository.deleteById(Id);	
		
	}

	@Override
	public Employee updateById(Employee employee) {
		Employee save = repository.save(employee);
		return save;
	}

}







