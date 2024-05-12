package RecursiveMethods;

import java.util.Scanner;

public class Fibonacci {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        int num = scan.nextInt();

        System.out.println("The Fibonacci number at position " + num + " is: " + fibonacci(num));
    }

    public static int fibonacci(int n){
        if (n == 0){
            return 0;
        } else if (n == 1 || n == 2){
            return 1; 
        } else if (n > 1){
            return fibonacci(n - 1) + fibonacci(n - 2);
        }

        return 0;
    }
}
