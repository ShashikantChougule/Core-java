package com.asssignment1;

public class Manager extends Employee {
	
	private double petrolAlwce;
	private double foodAlwce;
	private double otherAlwnce;
	
	public Manager() {
		super();
		double basesalary =getBaseSalary();
		petrolAlwce = basesalary*0.08;
		foodAlwce = basesalary*0.13;
		otherAlwnce = basesalary*0.03;
		
	}
	
	public Manager(int empId, String empName, double baseSalary, double medical) {
		super(empId, empName, baseSalary, medical);
		this.petrolAlwce = baseSalary*0.08;
		this.foodAlwce = baseSalary*0.13;
		this.otherAlwnce = baseSalary*0.03;
	}
	public double getPetrolAlwce() {
		return petrolAlwce;
	}
	public double getFoodAlwce() {
		return foodAlwce;
	}
	public double getOtherAlwnce() {
		return otherAlwnce;
	}
	
	
	
	@Override
	public String toString() {
		return "Manager [petrolAlwce=" + petrolAlwce + ", foodAlwce=" + foodAlwce + ", otherAlwnce=" + otherAlwnce
				+ "]";
	}

	public void display(){
		super.display();
		System.out.println("Manager : petrolAlwce=" + petrolAlwce + ", foodAlwce=" + foodAlwce + ","
				+ " otherAlwnce=" + otherAlwnce);
	}

}
