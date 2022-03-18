package com.ct.training;

public class Hello_Word {
	public static void main(String[] args) {
		System.out.println("Welcome to java world");
		
	 MyDate d1=new MyDate();
		// d1.init();
		 d1.dispalyDate();
		 d1.setDate(1,"june",2021);
		 d1.dispalyDate();
		 
		 MyDate d2=new MyDate(5, "april", 2021);
		 d2.dispalyDate();
	 }	
	
		}


