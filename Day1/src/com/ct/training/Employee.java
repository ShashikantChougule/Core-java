package com.ct.training;

class Employee1{
int empId;
String empName;
String empAddress;
public void get() {
	empId=1;
	empName="Shashi";
	empAddress="Sangli";
}
public void displayEmp() {
System.out.println(" \n Employee Details :"+"\n Employee ID:"+empId+"\n Employee Name:"+empName+
		            " \n Employee Address:"+empAddress);
}}

public class Employee {
	public static void main(String[] args) {
		
		Employee1 e1=new Employee1();
		e1.get();
		e1.displayEmp();
	
}

	

}
