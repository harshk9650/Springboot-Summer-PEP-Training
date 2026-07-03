package com.example.demo;


import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Employee;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@RestController
public class MyController {
	
	
	// when use of run time values use the constructor , if use the logic one time then use constructor otherwise method
	
	ArrayList<Employee> emp = new ArrayList<Employee>();
	public MyController() {
		emp.add(new Employee(1,"John",90,50000,"Manager"));
		emp.add(new Employee(2,"Birju",70,50000,"Developer"));
		emp.add(new Employee(3,"Makkhan",32,50000,"Tester"));
		emp.add(new Employee(4,"Sodhi",30,50000,"Manager"));
		
	}
	
	@GetMapping("/getAllEmployee")
	public List<Employee> getEmployees(){
		
		return emp;
		
	}
	
	@GetMapping("/getEmployee/{id}")
	public Employee getEmployeeById(@PathVariable int id) {
		for(Employee e: emp) {
			if(e.getId()==id) {
				return e;
			}
			
			
		}
		return null;
	}
	
	@DeleteMapping("/deleteEmployee/{id}")
	public String delEmployee(@PathVariable int id) {
		for(Employee e: emp) {
			if(e.getId()==id) {
				emp.remove(id);
				return "Employee is deleted succesfully";
			}
			
			
		}
		return null;
		
	}
	
	

}
