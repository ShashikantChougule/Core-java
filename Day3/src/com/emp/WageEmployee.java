package com.emp;

public class WageEmployee {
	protected int hrs;
	protected int rate;
	public int calinsentiv;
	public int getHrs() {
		return hrs;
	}
	public void setHrs(int hrs) {
		this.hrs = hrs;
	}
	public int getRate() {
		return rate;
	}
	public void setRate(int rate) {
		this.rate = rate;
	}
	public int getCalinsentiv() {
		return calinsentiv;
	}
	public void setCalinsentiv(int calinsentiv) {
		this.calinsentiv = calinsentiv;
	}
	public WageEmployee(int hrs, int rate, int calinsentiv) {
		super();
		this.hrs = hrs;
		this.rate = rate;
		this.calinsentiv = calinsentiv;
	}
	public WageEmployee() {
		super();
	}
	
}
