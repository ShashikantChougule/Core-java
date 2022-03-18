package com.exe;

public class Test {
	
	double radious;
	public void setRadius(double newRadious)
	throws IllegalArgumentException{
		if(newRadious>=0)
			radious= newRadious;
		else
			throw new IllegalArgumentException("Radius cannot be negative");	
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Test myTest=new Test();
		myTest.setRadius(-9);

	}

}
