package com.gen;

public class BoundedDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer inum[]= {1,2,3,4,5};
		Stats<Integer> iob=new Stats<Integer>(inum);
		double v=iob.average();
		System.out.println("iob average is : "+v);
		
		
		Double dnums[]={1.1,2.2,3.3,4.4,5.5};
		Stats<Double>dob=new Stats<Double>(dnums);
		double w=dob.average();
		System.out.println("dob average is : "+w);
		
		Long lnums[]= {1l,2l,3l,4l,5l};
		Stats<Long> lob=new Stats<Long>(lnums);
		double u=lob.average();
		System.out.println("lob average is : "+u);
		
		Float fnums[]= {1.1f,2.2f,3.3f,4.4f,5.5f};
		Stats<Float> fob=new Stats<Float>(fnums);
		double j=fob.average();
		System.out.println("fob average is : "+j);
		
		/*String str[]= {"1","2","3"};
		Stats<String> sob=new Stats<String>(strs);
		double x=sob.average();
		System.out.println("sob average is : "+x);*/
		
		if(iob.compareAvg(dob)) {
			System.out.println("Average for Int Array and Double Array is same");
		}
		if(iob.compareAvg(lob)) {
			System.out.println("Average for Int Array and long Array is same");
		}
		if(dob.compareAvg(lob)) {
			System.out.println("Average for Doublet Array and Long Array is same");
		}
		if(dob.compareAvg(fob)) {
			System.out.println("Average for Doublet Array and Float Array is same");
		}
		if(iob.compareAvg(fob)) {
			System.out.println("Average for Integer Array and Float Array is same");
		}
		if(lob.compareAvg(fob)) {
			System.out.println("Average for Long Array and Float Array is same");
		}
		
		
		
		

	}

}
