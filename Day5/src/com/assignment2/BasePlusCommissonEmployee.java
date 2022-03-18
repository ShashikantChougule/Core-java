package com.assignment2;

public class BasePlusCommissonEmployee extends CommissionEmployee {
	
	private double baseSalary;

	public double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(double baseSalary) {
		this.baseSalary = baseSalary;
	}

	public BasePlusCommissonEmployee() {
		super();
		baseSalary=10000;
	}

	public BasePlusCommissonEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales,
			double commissionRate,double baseSalary) {
		super(firstName, lastName, socialSecurityNumber, grossSales, commissionRate);
		 this.baseSalary = baseSalary;
	}
	
	@Override
	public double getPaymentAmount() {
		double payment= baseSalary + super.getPaymentAmount(); 
		return payment;
		
	}

	@Override
	public String toString() {
		return "BasePlusCommissonEmployee [baseSalary=" + baseSalary + "]";
	}
	
	


}
