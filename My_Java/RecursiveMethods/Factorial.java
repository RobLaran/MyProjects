package RecursiveMethods;

import java.util.Scanner;

public class Factorial {

    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter number: ");
        int num = scan.nextInt();

        System.out.println("Factorial of " + num + ": " + factorial(num));
    }

    public static int factorial(int n){
        if(n == 0){
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
}
