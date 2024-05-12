package Abstracttion.Shape;

public class Main {
    public static void main(String[] args) {
        double radius = 4;
        Shape circle = new Circle(radius);
        double side1 = 3;
        double side2 = 4;
        double side3 = 5;
        Shape triangle = new Triangle(side1, side2, side3);

        System.out.println("Radius of the circle: " + radius);
        System.out.println("Area of the circle: " + circle.calculateArea());
        System.out.println("Perimeter of the circle: " + circle.calculatePerimeter() + "\n");

        System.out.println("Sides of the triangle: " + side1 + ", " + side2 + ", " + side3);
        System.out.println("Area of the triangle: " + triangle.calculateArea());
        System.out.println("Perimeter of the triangle: " + triangle.calculatePerimeter());
    }
}
