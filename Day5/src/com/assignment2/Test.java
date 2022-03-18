package com.assignment2;

public class Test {
	
	  public static void dispaly(Employee[] emp){
	        for(Employee e:emp){
	            System.out.println(e);
	            System.out.println("------------------------------------------");
	        }
	    }
	    
	    public static void main(String[] args) {
	    
	        Invoic i=new Invoic();
	        i.setPartNumber("ts2636yc");
	        i.setPartDiscription("Dell Laptop");
	        i.setQuantity(6);
	        i.setPricePerItem(32000);
	        i.getPaymentAmount();
	        System.out.println(i);
	        
	        System.out.println("-----------------------------------------------");
	        
	        Employee[] emp =new Employee[5];
	        emp[0]=new Employee("Shashi", "Chougule", "uh77700");
	        emp[1]= new CommissionEmployee("Sagar", "Deshmukh", "hdj7335", 43000, 0.11);
	        emp[2]=new HourlyEmployee("shubham", "patil", "hsj83838", 400, 30);
	        emp[3]=new SalariedEmployee("vijay", "patil", "uey783838", 2000);
	        emp[4]=new BasePlusCommissonEmployee("vikas", "Patil", "dj7833e", 34000, 0.09, 22000);
	        dispaly(emp);

	 

	    }

	 
}
