package com.string;

public class AddVarargs {
  
	//here jvm prefers widening over varargs
	 
	static void go(int x,int y) {
		System.out.println("int,int");
	}
	
	static void go(byte...x) {
		System.out.println("Byte");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		byte b=5;
		go(b,b);

	}

}
