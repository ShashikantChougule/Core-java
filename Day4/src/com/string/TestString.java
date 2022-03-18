package com.string;

public class TestString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="abc";
		System.out.println(s.hashCode());
		
		String s1=s;
		System.out.println(s1.hashCode());
		
		String str=new String("Shashi");
		System.out.println(str.hashCode());
		
		//Imp methos of string
		
		
		String x="Aieplane";
         System.out.println(x.charAt(2));
         
         x="taxi";
         System.out.println(x.hashCode());
         System.out.println(x.concat("cab"));
         System.out.println(x);
         System.out.println(x.hashCode());
       
         //use the + and + =(overloaded operators to perfoem same opearation
         
         x="library";
         System.out.println(x+" card");
         
         
         x="Aritlantic";
         x+=" ocean";
         System.out.println(x);
         
         x="Exit";
         System.out.println(x.equalsIgnoreCase("Exit"));
         System.out.println(x.equalsIgnoreCase("tixe"));
         
         x="01234567";
         System.out.println(x.length());
         
         x="oxoxoxoxox";
         System.out.println(x.replace('x', 'X'));
         
         x="A New Moon";
         System.out.println(x.toLowerCase());
         
         x="A New Moon";
         System.out.println(x.toUpperCase());
         
         x="Big Surprise";
         System.out.println(x.toString());
         
         x="      hi     ";
         System.out.println(x.hashCode());
         System.out.println(x  +  "x");
         
         
         String x1=x.trim();
         System.out.println(x1.hashCode());
         System.out.println(x1+"x");
         
         
         String str1="Core Java";
         String lang=new String("Core Java");
         if(str1==lang) {
        	 System.out.println("String are equal");
         }
         if(str1.equals(lang)) {
        	 System.out.println("String are equal");
         }
        
        
         
         
         }

}
