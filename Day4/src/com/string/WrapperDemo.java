package com.string;

public class WrapperDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//how to create a wrapper class object
		
		Integer i1=new Integer(42);
		System.out.println(i1);
		Integer i2=new Integer(42);
		
		//for all the wrapper classes  other than string provide 2 constructors
		//one which take value and the other take the string.for char only one constructor
		Character c1=new Character('c');
		
		
		Boolean b=new Boolean("TRUE");
		System.out.println(b);
		Boolean b1=new Boolean(true);
		
		//value of methos is used to create wrapper object
		
		Integer i3=Integer.valueOf("101011", 2);
		System.out.println(i3);
		Float f2=Float.valueOf("3.14f");
		
		//xxxValue method is used to Convert the wrapper object to primitive value
		
		byte bval=i2.byteValue();
		System.out.println(bval);
		
		//parsXxx is used to convert string argument to primitive
		
		double d4=Double.parseDouble("3.14");
		System.out.println("d4 ="+d4);
		
		//value of method is used to convert the string arguments to wrapper object
		
		Double d5=Double.valueOf("3.14");
		
		//using radix arguments
		
		long L2=Long.parseLong("101010", 2);
		System.out.println("L2="+L2);
		
		Long L3=Long.valueOf("101010", 2);
		System.out.println("L3 value="+L3);
		
		//toXxxString used for Binary,Hexadecimal,Octal
		
		String s3=Integer.toHexString(254);
		System.out.println("254 is: "+s3);
		
		
		String s4=Long.toOctalString(254);
		System.out.println("254(Oct): "+s4);
		
		//autoboxing
		Integer ival=12;
		
		//unboxing
		int val=ival;
		
		
		

	}

}
