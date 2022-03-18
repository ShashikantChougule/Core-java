package com.string;

public class BoxoeVararg {
	
	static void go(Byte x,Byte y) {
		System.out.println("Bye,Bye");
	}
	
	static void go(Byte...x) {
		System.out.println("Bye....");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		byte b=5;
		go(b,b);
		
		

	}

}
