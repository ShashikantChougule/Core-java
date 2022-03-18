package com.asssignment1;

public class MarketingExecutive extends Employee {
	
	private int kmTravlled;
	private double tourAlwnce;
	private static int teleAlwance;
	
	public void setKmTravlled(int kmTravlled) {
		this.kmTravlled = kmTravlled;
	}
	public int getKmTravlled() {
		return kmTravlled;
	}
	public double getTourAlwnce() {
		return tourAlwnce;
	}
	
	public static int getTeleAlwance() {
		return teleAlwance=2500;
	}
	
	
	public MarketingExecutive(int empId, String empName, double baseSalary, double medical, int kmTravlled) {
		super(empId, empName, baseSalary, medical);
		this.kmTravlled = kmTravlled;
		this.tourAlwnce = kmTravlled*10;
		teleAlwance=getTeleAlwance();
	}

	public MarketingExecutive() {
		super();
		kmTravlled = 1;
		tourAlwnce = kmTravlled*10;
		teleAlwance=getTeleAlwance();
		
	}	

	public void display(){
		super.display();
		System.out.println("MarketingExecutive : KM Travelled=" + kmTravlled + ", Tour Allowance =" + tourAlwnce +" Telephone Allowance = "+teleAlwance);
	}


}
