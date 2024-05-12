package Methods;

import java.util.Scanner;

public class AreaTriangle {

    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        
        System.out.print("Input side-1: ");
        int side1 = scan.nextInt();
        System.out.print("Input side-2: ");
        int side2 = scan.nextInt();
        System.out.print("Input side-3: ");
        int side3 = scan.nextInt();

        calculateArea(side1, side2, side3);

    }

    static void calculateArea(double a, double b, double c){

        double semiPerim = (a+b+c)/2;

        double areaTri= Math.sqrt(semiPerim * ((semiPerim - a) * (semiPerim - b) * (semiPerim - c)));

        System.out.println("The area of the triangle is " + areaTri);
        
    }

}
