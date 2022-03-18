package com.asssignment1;

public class TestEmp {
	public static void showDetails(Employee[] earr){
		for(Employee emp : earr){
			emp.display();
			emp.toString();
			
		}
	}
	public static void main(String[] args) {
		
		Employee[] e=new Employee[3];
		e[0]=new Employee(1, "Shashi", 30000, 1200);
		e[1]=new Manager(2, "Ajay",20000, 1200);
		e[2]=new MarketingExecutive(3, "Vijay", 25000, 1200, 100);
		showDetails(e);
		
	}

}
