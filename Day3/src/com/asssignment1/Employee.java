package com.asssignment1;

public class Employee {
	
	private int empId;
	private String empName;
	private double baseSalary;
	private double hra;
	private double pf;
	private static int pt;
	private double netSalary;
	private double grossSalary;
	private double medical;
	
	public static int getPt(){
		return pt=200;
	}

	public int getEmpId() {
		return empId;
	}

	public double getMedical() {
		return medical;
	}

	public void setMedical(double medical) {
		this.medical = medical;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(double baseSalary) {
		this.baseSalary = baseSalary;
	}

	public double getHra() {
		return hra;
	}

	public double getPf() {
		return pf;
	}


	public double getNetSalary() {
		return netSalary;
	}

	public double getGrossSalary() {
		return grossSalary;
	}
	

	public Employee(int empId, String empName, double baseSalary, double medical) {
		this.pt=getPt();
		this.empId = empId;
		this.empName = empName;
		this.baseSalary = baseSalary;
		this.hra = baseSalary/2;
		this.pf = baseSalary*0.12;
		this.medical = medical;
		this.grossSalary = baseSalary+hra+medical;
		this.netSalary = grossSalary-(pf+pt);;
		
	}

	public Employee() {
		pt=getPt();
		empId = 1;
		empName = "Enter Name";
		baseSalary = 20;
		hra = baseSalary/2;
		pf = baseSalary*0.12;
		medical = 2;
		grossSalary = baseSalary+hra+medical;
		netSalary = grossSalary-(pf+pt);
		
		
	}

	public void display(){
		/*System.out.println("Employee: empId=" + empId + ", empName=" + empName + ", baseSalary=" + baseSalary + ", hra=" + hra
				+ ", pf=" + pf + ", netSalary=" + netSalary + ", grossSalary=" + grossSalary + ", medical=" + medical +" PT="+pt);*/
		
		System.out.println(this);		
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", baseSalary=" + baseSalary + ", hra=" + hra
				+ ", pf=" + pf + ", netSalary=" + netSalary + ", grossSalary=" + grossSalary + ", medical=" + medical
				+ "]";
	}
	
	
	
	

}
