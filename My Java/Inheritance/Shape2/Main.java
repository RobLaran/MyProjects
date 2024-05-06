package Inheritance.Shape2;

public class Main {
    public static void main(String[] args) {
        Circle c1 = new Circle(8);
        Circle c2 = new Circle(3.2);

        System.out.println("Radius of the circle: " + c1.getRaddius());
        System.out.println("Perimeter: " + c1.getPerimeter());
        System.out.println("Area: " + c1.getArea() + "\n");

        System.out.println("Radius of the circle: " + c2.getRaddius());
        System.out.println("Perimeter: " + c2.getPerimeter());
        System.out.println("Area: " + c2.getArea());

    }
}
