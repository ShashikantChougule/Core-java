package com.test;

import com.model.Employee;
import com.repository.EmployeeRepository;
import com.repository.EmployeeRepositoryImpl;

public class Test {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		  EmployeeRepository empRepo = new EmployeeRepositoryImpl(); 
		/*
		 * Employee emp = new Employee(101, "Shashi", "Chougule");
		 * empRepo.addEmployee(emp);
		 * 
		 * System.out.println("-----------------------------------");
		 */
		  empRepo.deleteEmployee(112);
		  
		  
		  
		 
		
		
		
		 
	}

}
