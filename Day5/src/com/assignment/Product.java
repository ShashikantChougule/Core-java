package com.assignment;

import com.exe.InvalidBalException;

public class Product {
	
	
	String prodId;
	String prodName;
	double stockInHand;
	
	public Product(){
		prodId="1";
		prodName="Laptop";
		stockInHand=100;
		}

	public Product(String prodId, String prodName, double stockInHand) {
		super();
		this.prodId = prodId;
		this.prodName = prodName;
		this.stockInHand = stockInHand;
	}

	@Override
	public String toString() {
		return "Product [prodId=" + prodId + ", prodName=" + prodName + ", stockInHand=" + stockInHand + "]";
	}
	
	public void stock(double quantity) {
		double tStock = 0;
		try {
			
			if(tStock<=100) {
				throw new  InvalidStockException("Stock is available");
				
			}
			else {
				System.out.println("Out of stock");
		}}
		catch(InvalidStockException ex){
			System.out.println(ex.getMessage());
		}
	}

}
