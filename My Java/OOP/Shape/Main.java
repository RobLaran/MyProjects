package OOP.Shape;

// Write a Java program to create a class called "Shape" with abstract methods for calculating area and perimeter, and subclasses for "Rectangle", "Circle", and "Triangle".

// Note: An abstract class is a class that is declared abstract—it may or may not include abstract methods. Abstract classes cannot be instantiated, but they can be subclassed.

// An abstract method is a method that is declared without an implementation (without braces, and followed by a semicolon).

// The above "Shape" class is an abstract class that defines the basic properties and behaviours of a geometric shape. It contains two abstract methods, "getArea()" and "getPerimeter()", which are to be implemented by its subclasses. Since the class is abstract, it cannot be instantiated on its own, but it provides a framework for other classes to extend and implement its methods.

// The above code represents a class called ‘Rectangle’ that extends the ‘Shape’ abstract class. The ‘Rectangle’ class has two instance variables, ‘length’ and ‘width’, and a constructor that initializes these variables. It also has methods to calculate the area and perimeter of a rectangle using the ‘getArea()’ and ‘getPerimeter()’ methods respectively. The ‘getArea()’ method returns the product of the length and width variables while the ‘getPerimeter()’ method returns twice the sum of the length and width variables.

// The "Circle" class is a subclass of the abstract "Shape" class. It has a private instance variable for the radius of the circle. It implements abstract methods for calculating the area and perimeter of the circle. The area is calculated by multiplying the square of the radius by pi. The perimeter is calculated by multiplying the radius by twice pi value.

// The "Triangle" class is a subclass of the "Shape" abstract class that represents a triangle shape. It has three instance variables to store the length of its three sides. It has a constructor that takes these three sides as parameters. The class provides implementations of the abstract methods "getArea()" and "getPerimeter()" to calculate the area and perimeter of the triangle based on its three sides using standard formulas.

// The Main class creates instances of different shape objects including a rectangle, circle, and triangle. It then calls methods to calculate the area and perimeter of each shape and displays the results in the console.

// Sample Output:

// Area and perimeter of various shapes:

// Rectangle: Length-10, Width-12
// Area: 120.0
// Perimeter: 44.0

// Circle: Radius-5
// Area: 78.53981633974483
// Perimeter: 31.41592653589793

// Triangle: Side1-7, Side2-8, Side3-6
// Area: 20.33316256758894
// Perimeter: 21.0


public class Main{
    public static void main(String[] args) {
        
        Shape rectangle = new Rectangle(10, 12);
        Shape triangle = new Triangle(7, 8, 6);
        Shape circle = new Circle(5);

        System.out.println("Area and Perimeter of various shapes:" + "\n");

        System.out.println("Rectangle : Length-10, Width-12");
        System.out.println("Area: " + rectangle.getArea());
        System.out.println("Perimeter: " + rectangle.getPerimeter() + "\n");

        System.out.println("Circle: Radius-5");
        System.out.println("Area: " + circle.getArea());
        System.out.println("Perimeter: " + circle.getPerimeter() + "\n");

        System.out.println("Triangle: Side1-1, Side-2,8, Side-6");
        System.out.println("Area: " + triangle.getArea());
        System.out.println("Perimeter: " + triangle.getPerimeter());
        
    }
}