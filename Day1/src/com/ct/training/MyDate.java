package com.ct.training;

public class MyDate {
	
	int dd;
	String mm;
	int yy;
	
	/*public void init() {
		dd=1;
		mm="may";
		yy=2021;
	}*/
	public MyDate() {
		dd=1;
		mm="may";
		yy=2021;
		
	}
	/*public Dateformat(int d,String m,int y) {
		dd=d;
		mm=m;
		yyyy=y;
		
	}*/
	public MyDate(String mm,int yy) {
		
		this.mm=mm;
		this.yy=yy;
		
	}
	public MyDate(int dd,String mm,int yy) {
		this(mm,yy);
		this.dd=dd;
	
	}
	
public void dispalyDate() {
	System.out.println("Date is: "+dd+"_"+mm+"_"+yy);
}



public void setDate(int d,String m,int y) {
         dd=d;
         mm=m;
         yy=y;
}
}
