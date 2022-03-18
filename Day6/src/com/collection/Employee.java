package com.collection;

public class Employee implements Comparable<Employee> {
	
	private int eId;
	String eName;
	private double sal;
	
	public Employee() {
		eId=101;
		eName="Sam";
		sal=5000;
	}

	public Employee(int id, String name, double s) {
	
		eId = id;
	    eName = name;
	    sal = s;
	}

	@Override
	public String toString() {
		return "Employee [eId=" + eId + ", eName=" + eName + ", sal=" + sal + "]";
	}
	
	
	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		System.out.println("Inside compareTo of employee");
		if(this.eId<o.eId) {
			return -1;
		}
		else if(this.eId>o.eId) {
			return 1;
		}
		else
		return 0;
	}
	
	

}
