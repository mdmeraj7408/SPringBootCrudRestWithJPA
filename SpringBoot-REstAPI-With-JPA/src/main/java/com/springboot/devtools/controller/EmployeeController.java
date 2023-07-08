package com.springboot.devtools.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.devtools.model.Employee;
import com.springboot.devtools.service.EmployeeService;

 
//@Controller
@RestController //@controller+ResponseBody
//@RequestMapping("/api/v1") we can use in propeties file
public class EmployeeController {
   @Autowired 
	private EmployeeService  eserv;
	
     @GetMapping("/emp")//@RequestMapping(value = "/emp",method =RequestMethod.GET)
     public List<Employee> getEmployee()
	{
		return eserv.getEmployee();
    }
    
     @GetMapping("/emp/{id}")
     public Employee  getEmployeeById(@PathVariable("id") Long id) 
     {
    	 	return eserv.getEmployeeByID(id);
     }
     
     //localhost:8080/emp?id=11
     @DeleteMapping("/emp")
     public void deleteEmp(@RequestParam Long id)
     {
    	 eserv.deleteEmployeeByID(id);
 		
     }
     @PostMapping("/emp")
     public Employee saveEmployee(@RequestBody Employee emp)
     {
    	 return eserv.saveEmployee(emp);
     }
     @PutMapping("/emp/{id}")
     public Employee updateEmp(@PathVariable Long id ,@RequestBody Employee emp)
     {
    	 emp.setId(id);
		return eserv.updateById(emp);
    	 
     }
}







 







   






















