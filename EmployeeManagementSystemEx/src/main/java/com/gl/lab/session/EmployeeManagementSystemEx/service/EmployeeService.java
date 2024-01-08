package com.gl.lab.session.EmployeeManagementSystemEx.service;

import java.util.List;

import com.gl.lab.session.EmployeeManagementSystemEx.entity.Employee;

public interface EmployeeService {
	List<Employee> getAllEmployees();
	
	Employee saveEmployee(Employee employee);
	
	Employee getEmployeeById(Long id);
	
	Employee updateEmployee(Employee employee);
	
	void deleteEmployeeById(Long id);
}
