package RecursiveMethods;

import java.util.Scanner;

public class Sum {
    public static Scanner scan =  new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter number: ");
        int num = scan.nextInt();

        System.out.println("Sum of all numbers from 1 to " + num + ": " + sum(num));
    }

    public static int sum(int n){
        if(n == 0){
            return 0;
        } else {
            return n + sum(n - 1);
        }
    }
}
