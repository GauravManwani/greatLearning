package com.greatlearning.aopdemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.greatlearning.aopdemo.entity.Employee;
import com.greatlearning.aopdemo.service.EmployeeService;

@RestController
public class EmployeeController {
	
	@Autowired
	EmployeeService employeeService;
	
	@GetMapping("/save")
	public void addEmployee() {
		employeeService.createEmployee("","emp101");
	}

}
