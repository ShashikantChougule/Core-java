package com.ct.assignment;

public class Circle extends Shape {
    private  double radius;
    final double pi = Math.PI;

    public Circle() {
      
    }   
    public Circle(double radius) {
        this.radius = radius;
    }

    
    public double area() {
        // A = π r^2
        return pi * Math.pow(radius, 2);
    }

   
}
