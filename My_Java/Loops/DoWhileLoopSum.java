package Loops;

import java.util.Scanner;

public class DoWhileLoopSum {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int num1, num2, sum;
        char response;

        do {
            System.out.print("Enter first number: ");
            num1 = scan.nextInt();

            System.out.print("Enter second number: ");
            num2 = scan.nextInt();
            
            sum = num1 + num2;  

            System.out.println("Sum: " + sum);

            System.out.print("Do u wish to perform again? y/n: ");
            response = scan.next().charAt(0);

        } while (response == 'y' || response == 'Y');

        scan.close();
        
    }
}
