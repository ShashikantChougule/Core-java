package com.string;

public class BoxAndWiden {
	
	static void go(Object o) {
		Byte b2=(Byte)o;
		System.out.println(b2);
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		byte b=5;
		go(b);
		
		Object obj=new Integer(2);

	}

}
