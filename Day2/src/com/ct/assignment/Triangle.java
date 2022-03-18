package com.ct.assignment;

public class Triangle extends Shape {
    private double a, b, c; // sides

    public Triangle() {
       
    }
    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

   
    public double area() {
      
      
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

   
    
}
