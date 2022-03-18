package com.gen;

public class PowerOfThree <T extends Number> implements Mathematics<T>{
	

	@Override
	public int powerof(T i) {
		// TODO Auto-generated method stub
		return i.intValue()*i.intValue()*i.intValue();
	}

}
