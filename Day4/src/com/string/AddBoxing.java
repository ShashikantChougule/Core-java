package com.string;

public class AddBoxing {
	
	//in this case it refferes widening
	
	static void go(Integer x) {
		System.out.println("Integer");
	}
	
	static void go(long x) {
		System.out.println("Long");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i=5;
		go(i);

	}

}
