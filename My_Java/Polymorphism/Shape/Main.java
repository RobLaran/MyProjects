package Polymorphism.Shape;

public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle(4);
        Shape rectangle = new Rectangle(12, 34);
        Shape triangle = new Triangle(15, 16, 17);

        System.out.printf("Area of a Circle: %.2f \n", circle.getArea(), 2);
        System.out.printf("Area of a Rectangle: %.2f \n", rectangle.getArea());
        System.out.printf("Area of a Triangle: %.2f", triangle.getArea());

    }
}
