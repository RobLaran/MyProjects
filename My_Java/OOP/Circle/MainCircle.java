package OOP.Circle;

// Initial radius = 5

// New radius = 8

public class MainCircle{
    public static void main(String[] args) {
        double rad = 5;
        
        Circle circle = new Circle(rad);

        System.out.println("Radius of the circle is " + rad);
        System.out.println("The area of the circle is " + circle.getArea());
        System.out.println("The circumference of the circle is " + circle.getCircumference());

        double newRad = 8;
        circle.setRadius(newRad);
        System.out.println();

        System.out.println("Radius of the circle is " + rad);
        System.out.println("The area of the circle is " + circle.getArea());
        System.out.println("The circumference of the circle is " + circle.getCircumference());
    }
}
