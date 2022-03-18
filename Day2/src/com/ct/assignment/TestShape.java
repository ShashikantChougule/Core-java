package com.ct.assignment;

public class TestShape {
    public static void main(String[] args) {

        // Rectangle 
        double width = 5, length = 7;
        Shape rectangle = new Rectangle(width, length);
        System.out.println("Rectangle width: " + width + " and length: " + length
                + "\nResulting area of Rectangle: " + rectangle.area());

        // Circle 
        double radius = 5;
        Shape circle = new Circle(radius);
        System.out.println("Circle radius: " + radius
            + "\nResulting Area Circle: " + circle.area());

        // Triangle
        double a = 5, b = 3, c = 4;
        Shape triangle = new Triangle(a,b,c);
        System.out.println("Triangle sides lengths: " + a + ", " + b + ", " + c
                + "\nResulting Area of Triangle: " + triangle.area());
    }
}
