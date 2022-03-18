package com.ifac;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Bouncable b;
		b=new Football();
		b.bounce();
		b.move();
		
		//here we can call only move method not a bounce method
		Football fball=new Football();
		Moveable m=fball;
		m.move();
	}

}
