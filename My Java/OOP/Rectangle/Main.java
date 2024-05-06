package OOP.Rectangle;

public class Main {

    // Rectange width = 7
    // Rectangle height = 12

    // Setting new width = 6

    public static void main(String[] args) {
       Rectangle rectangle = new Rectangle(7, 12);
       
       System.out.println("The area of the rectangle is " + rectangle.getArea());
       System.out.println("The perimeter of the rectangle is " + rectangle.getPerimeter());

       System.out.println();
       rectangle.setWidth(6);

       System.out.println("The area of the rectangle is now " + rectangle.getArea());
       System.out.println("The perimeter of the rectangle is now " + rectangle.getPerimeter());

    }
}
