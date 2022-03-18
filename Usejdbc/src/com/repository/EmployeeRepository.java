package com.repository;

import java.util.List;

import com.model.Employee;

public interface EmployeeRepository {
	
	
	public Employee addEmployee(Employee e);
	public int updateEmployee(Employee e);
	public void deleteEmployee(int empid);
	public List<Employee> getAllEmployees();
	

}
