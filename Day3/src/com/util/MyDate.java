package com.util;

public class MyDate {
	private int dd;
	private String mm;
	private int yy;
	
	
	public MyDate()
	{
		//System.out.println("Contructor 0 argument");
		this.dd=1;
		this.mm="Feb";
		this.yy=3722;
	}
	
	public MyDate(String mm,int yy)
	{
		//System.out.println("2 param contructor");
		this.mm=mm;
		this.yy=yy;
	}
	
	public MyDate(int d,String mm,int yy)
	{
		
		this(mm,yy);
		//System.out.println("3 param contructor");

		this.dd=d;

	
	}
	public void setDd(int d)
	{
		dd=d;
	}
	
	public int getDd()
	{
		return dd;
	}
	
	public void setMm(String m)
	{
		mm=m;
	}
	
	public String getMm()
	{
		return mm;
	}
	
	public void setYy(int y)
	{
		yy=y;
	}
	
	public int getYy()
	{
		return yy;
	}
	
	/*
	 * public void init() { dd=1; mm="Jan"; yy=2021; }
	 */
	
	public void displayDate()
	{
		System.out.println("Date is :"+dd+"-"+mm+"-"+yy);
	}
	
	public void setDate(int d,String m,int y)
	{
		dd=d;
		mm=m;
		yy=y;
	}



}
