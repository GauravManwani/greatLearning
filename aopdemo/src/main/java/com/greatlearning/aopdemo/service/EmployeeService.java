package com.greatlearning.aopdemo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.greatlearning.aopdemo.entity.Employee;
import com.greatlearning.aopdemo.repo.EmployeeRepo;

@Service
public class EmployeeService {
	
	@Autowired
	EmployeeRepo employeeRepo;
	
	@Value("${full.name}")
	private String fullName;
	
	public void createEmployee(String name, String empId) {
		Employee emp=new Employee();
		emp.setId(1);
		emp.setName("Gaurav");
		emp.setEmpId("Emp101");
		
		System.out.println("Full Name is : "+fullName);
		
		
		employeeRepo.save(emp);
		
		throw new IllegalArgumentException("Emp Details ALready exists");
	}
}
