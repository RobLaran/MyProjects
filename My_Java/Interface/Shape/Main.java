package Interface.Shape;

public class Main {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(10, 12);
        Shape circle = new Circle(3);
        Shape triangle = new Triangle(4, 6);

        System.out.println("Area of rectangle: " + rectangle.getArea());
        System.out.println("Area of circle: " + circle.getArea());
        System.out.println("Area of triangle: " + triangle.getArea());


    }
}
