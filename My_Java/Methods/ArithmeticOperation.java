package Methods;

import java.util.Scanner;

public class ArithmeticOperation {

    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        
        calculateSum();  

    }

    public static void calculateSum(){

        System.out.println("Sum Opearation");

        System.out.print("First Num: ");
        int num1 = scan.nextInt();
        System.out.print("Second Num: ");
        int num2 = scan.nextInt();

        int sum = num1 + num2;

        System.out.println("Sum: " + sum);
        System.out.println(); 

        calculateDifference();

    }

    public static void calculateDifference(){

        System.out.println("Difference Operation");

        System.out.print("First Num: ");
        int num1 = scan.nextInt();
        System.out.print("Second Num: ");
        int num2 = scan.nextInt();

        int difference = num1 - num2;

        System.out.println("Difference: " + difference);
        System.out.println();

        calculateProduct();

    }

    public static void calculateProduct(){

        System.out.println("Product Operation");

        System.out.print("First Num: ");
        int num1 = scan.nextInt();
        System.out.print("Second Num: ");
        int num2 = scan.nextInt();

        int product = num1 * num2;

        System.out.println("Product: " + product);
        System.out.println();
        
        calculateQuotient();

    }

    public static void calculateQuotient(){

        System.out.println("Quotient Operation");

        System.out.print("First Num: ");
        int num1 = scan.nextInt();
        System.out.print("Second Num: ");
        int num2 = scan.nextInt();

        int quotient = num1 / num2;

        System.out.println("Quotient: " + quotient);

    }
}
