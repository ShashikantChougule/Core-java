package com.assignment2;

public class CommissionEmployee extends Employee {
	
	private double grossSales;
	private double  commissionRate;
	
	public double getGrossSales() {
		return grossSales;
	}
	public void setGrossSales(double grossSales) {
		this.grossSales = grossSales;
	}
	public double getCommissionRate() {
		return commissionRate;
	}
	public void setCommissionRate(double commissionRate) {
		this.commissionRate = commissionRate;
	}
	public CommissionEmployee() {
		super();
		grossSales=10000;
		commissionRate=20000;
	}

	public CommissionEmployee(String firstName, String lastName, String socialSecurityNumber,double grossSales, double commissionRate) {
		super(firstName, lastName, socialSecurityNumber);
		this.grossSales = grossSales;
		this.commissionRate = commissionRate;
	}
	
	@Override
	public double getPaymentAmount() {
		
		double payment= grossSales*commissionRate;
		return payment;
		
	}
	@Override
	public String toString() {
		return "CommissionEmployee [grossSales=" + grossSales + ", commissionRate=" + commissionRate + "]";
	}
	
	

}
