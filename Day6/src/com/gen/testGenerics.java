package com.gen;

public class testGenerics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PowerOfThree<Float> pthree=new PowerOfThree<Float>();
		System.out.println("5^3->"+pthree.powerof(5f));
		
		PowerOfTwo<Double> dtwo=new PowerOfTwo<Double>();
		System.out.println("3^2->"+dtwo.powerof(3));

	}

}
