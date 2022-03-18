package com.gen;

public class Stats<T extends Number>{
	
	
	T[]nums;
	
	
	/*array of number or subclass pass a constructor
	a reference to an array of type Number or subclass*/
	Stats(T[]o){
		
		
		nums=o;
	}
	
	//Return type double in all cases
	double average() {
		double sum=0.0;
		for(int i=0;i<nums.length;i++)
			sum+=nums[i].doubleValue();
		return sum/nums.length;
	}
	
	Boolean compareAvg(Stats<?> sobj) {
		if(this.average()==sobj.average()) {
			return true;
		}
		else 
			return false;

		
	}

}
