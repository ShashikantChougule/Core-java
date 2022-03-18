package com.assertion;

public class AssertionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num;
		num=Integer.parseInt(args[0]);
		
		//this is simple assert
		
		assert(num>=0);
		System.out.println("Number is : "+num);
		
		int x,y;
		x=10;
		y=2;
		
		//this is simple assert
		
		assert(y>x):"Y is : "+y+"X is : "+x;
		
		

	}

}
