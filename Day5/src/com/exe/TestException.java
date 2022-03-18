package com.exe;

public class TestException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int no1;
		int no2;
		int res=0;
		
		try {
			no1=Integer.parseInt(args[0]);
			no2=Integer.parseInt(args[1]);
			
			res=no2/no1;
		}
		catch(ArithmeticException e){
			e.printStackTrace();
			
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
			
		}
		
		System.out.println("Result is : "+res);

	}

}
