package com.model;

public class Employee {
	
	private int employee_id;
	private String firstName;
	private String lastName;
	
	
	public Employee() {
		
	}


	public Employee(int employee_id, String firstName, String lastName) {
	
		this.employee_id = employee_id;
		this.firstName = firstName;
		this.lastName = lastName;
	}


	public int getEmployee_id() {
		return employee_id;
	}


	public void setEmployee_id(int employee_id) {
		this.employee_id = employee_id;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	@Override
	public String toString() {
		return "Employee [employee_id=" + employee_id + ", firstName=" + firstName + ", lastName=" + lastName + "]";
	}
	
	
	
	
	

}
