package Polymorphism.Shape2;

public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle(7);
        Shape cylinder = new Cylinder(4, 9);

        circle.draw();
        System.out.printf("Area : %.2f \n", circle.calculateArea());
        cylinder.draw();
        System.out.printf("Area : %.2f", cylinder.calculateArea());
    }
}
