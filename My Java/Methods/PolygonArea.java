package Methods;

import java.util.Scanner;

public class PolygonArea {

    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        
        calculateAreaOfPentagon(inputSides(), inputLength());

    }

    static double inputSides(){
        
        System.out.print("Input the number of sides: ");
        double sides = scan.nextDouble();

        return sides;
    }

    static double inputLength(){

        System.out.print("Input the length of sides: ");
        double length = scan.nextDouble();

        return length;
        
    }

    private static void calculateAreaOfPentagon(double sides, double length){

        double perimeter = sides * length;
        double angle = Math.toRadians((360 / sides) / 2);
        double apothem = (length / 2) / Math.tan(angle);
        double area = (perimeter * apothem) / 2;

        System.out.println("The area of the pentagon is " + area);

    }
}
