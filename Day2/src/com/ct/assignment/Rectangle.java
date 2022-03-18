package com.ct.assignment;

public class Rectangle extends Shape {
    private double width, length; //sides

    public Rectangle() {
      
    }
    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    
    public double area() {
        // A = w * l
        return width * length;
    }

   
   

}