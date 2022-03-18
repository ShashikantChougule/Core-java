package com.assignment2;

public class Invoic implements Payable {
	
	private String partNumber;
	private String partDiscription;
	private int quantity;
	private double pricePerItem;
	
	public String getPartNumber() {
		return partNumber;
	}
	public void setPartNumber(String partNumber) {
		this.partNumber = partNumber;
	}
	public String getPartDiscription() {
		return partDiscription;
	}
	public void setPartDiscription(String partDiscription) {
		this.partDiscription = partDiscription;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getPricePerItem() {
		return pricePerItem;
	}
	public void setPricePerItem(double pricePerItem) {
		this.pricePerItem = pricePerItem;
	}
	
	public void Invoice(String partNumber, String partDiscription, int quantity, double pricePerItem) {
		
		this.partNumber = partNumber;
		this.partDiscription = partDiscription;
		this.quantity = quantity;
		this.pricePerItem = pricePerItem;
	}
	
	public void Invoice() {
		
	}
	@Override
	public double getPaymentAmount() {
		double total=pricePerItem*quantity;
		return 0;
	}
	@Override
	public String toString() {
		return "Invoic [partNumber=" + partNumber + ", partDiscription=" + partDiscription + ", quantity=" + quantity
				+ ", pricePerItem=" + pricePerItem + "]";
	}
	
	

}
