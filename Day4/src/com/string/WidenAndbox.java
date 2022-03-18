package com.string;

public class WidenAndbox {
	
	//The method go(Long) in the type WidenAndbox is not applicable for the arguments (byte)
	
	static void go(Long x) {
		System.out.println("Long");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		byte b=5;
		go(b);

	}
	
	
	
      
}
