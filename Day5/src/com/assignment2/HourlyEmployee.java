package com.assignment2;

public class HourlyEmployee extends Employee {
	
	private double wage;
	private double hours;
	
	public double getWage() {
		return wage;
	}

	public void setWage(double wage) {
		this.wage = wage;
	}

	public double getHours() {
		return hours;
	}

	public void setHours(double hours) {
		this.hours = hours;
	}

	public HourlyEmployee(String firstName, String lastName, String socialSecurityNumber,double wage, double hours) {
		super(firstName, lastName, socialSecurityNumber);
		this.wage = wage;
		this.hours = hours;
	}

	public HourlyEmployee() {
		super();
		wage=100;
		hours=0;
	}
	
	@Override
	public double getPaymentAmount() {
		double payment = wage*hours;
		return payment;
	}

	@Override
	public String toString() {
		return "HourlyEmployee [wage=" + wage + ", hours=" + hours + "]";
	}
	
	
	
	

}
