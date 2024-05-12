package Encapsulation.Circle;

// Write a Java program to create a class called Circle with a private instance variable radius. Provide public getter and setter methods to access and modify the radius variable. However, provide two methods called calculateArea() and calculatePerimeter() that return the calculated area and perimeter based on the current radius value.

// These methods use the formula Math.PI*radius*radius for area calculation and 2*Math.PI*radius for perimeter calculation.

// Circle Radius: 7.0
// Circle Area: 153.93804002589985
// Circle Perimeter: 43.982297150257104

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle();

        circle.setRadius(7);

        System.out.println("Circle Radius: " + circle.getRadius());
        System.out.println("Circle Area: " + circle.calculateArea());
        System.out.println("Circle Perimeter: " + circle.calculatePerimeter());
        
    }
}
