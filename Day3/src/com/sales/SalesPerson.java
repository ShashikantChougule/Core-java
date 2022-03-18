package com.sales;

import com.util.Address;
import com.util.MyDate;

public class SalesPerson {
	private int price;
	private int quantity;

	public SalesPerson(int empId, String empName, MyDate Joindate, Address Address, int hrs, int rate,int price,int quantity) {
		super();
		// TODO Auto-generated constructor stub
		
		this.price=price;
		
		this.quantity=quantity;
	}
	public SalesPerson(int empId,String empName,MyDate Joindate,int hrs,int rate,Address Address,int price,int quantity) {
		super();
		this.price=price;
		this.quantity=quantity;
	}
	
	public void display() {
		super.display();
		System.out.println("Price: "+price+"\t quantity: "+quantity);
	}
	
	public double calsal() {
		return super.calsal();
	}
	
	public int calinsentiv() {
		int rate = 0;
		int hrs = 0;
		return super.calinsentiv=hrs*rate;
	}
	
	

}
