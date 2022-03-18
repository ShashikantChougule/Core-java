package com.gen;

import java.io.ObjectInputStream.GetField;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		GeneralClass g1=new GeneralClass("Hello");
		String msg=(String) g1.getObj();
		System.out.println("Messege : "+msg);
		
		GeneralClass g2=new GeneralClass(100);
		Integer i=(Integer) g2.getObj();
		System.out.println("Value is : "+i);
		
		g1=g2;
		if(g1.obj instanceof String) {
			msg=(String) g1.getObj();
			System.out.println("Getting msg again : "+msg);
		}
		
		
		
		Gen<Integer> g3=new Gen<Integer>(100);
		Integer ival=g3.getObj();
		System.out.println("val is:"+ival);
		
		
		Gen<String> g4=new Gen<String>("Welcome");
		String greetMsg=g4.getObj();
		System.out.println("Greet Msg is: "+greetMsg);
		
		//g3=g4;  g3 is int and g4 is string
		
		
		TwoGen<Integer,String> empData=new TwoGen<Integer, String>(100, "Shashi");
		empData.showTpes();
		System.out.println("Employee Id : "+empData.getob1());
		System.out.println("Employee Name : "+empData.getob2());
		
		
		}

}
