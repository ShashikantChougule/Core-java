package com.string;

public class UseVarargs {
	
	/*public void add(int no1,int no2) {
		System.out.println("Addition is : "+(no1+no2));
	}
	public void add(int no1,int no2,int no3) {
		System.out.println("Addition is : "+(no1+no2+no3));
		
	}
	public void add(int no1,int no2,int no3,int no4) {
		System.out.println("Addition is : "+(no1+no2+no3+no4));
	}*/

    //instead of using overriden method we can use Variable arguments 
	
	public void add(int...nos) {
		int res=0;
		for(int i:nos) {
			res=res+i;
		}
		System.out.println("Result is : "+res);
	}
	
	public static void main(String[] args) {
		
		
		UseVarargs var=new UseVarargs();
		var.add();
		var.add(12,34);
		var.add(43,43,45);
		var.add(12,23,34,34);
	}

}
