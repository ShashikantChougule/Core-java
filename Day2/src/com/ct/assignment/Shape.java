package com.ct.assignment;

public abstract class Shape {
	
	public String type;
	
	    public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	
	}
	

		public Shape(String type) {
		super();
		this.type = type;
	}
		
		

		public Shape() {
			super();
		}

		public abstract double area();
	   
	
}
