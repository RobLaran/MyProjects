package Encapsulation.Rectangle;

public class Main {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle();

        rect.setLength(6.7);
        rect.setWidth(12.0);

        System.out.println("Length: " + rect.getLength());
        System.out.println("Width: " + rect.getWidth());
    }
}
