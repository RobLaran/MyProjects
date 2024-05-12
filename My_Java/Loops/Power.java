package Loops;

import java.util.Scanner;

public class Power{ 
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        int base, power, result = 1;

        System.out.println("Enter base number: ");
        base = scan.nextInt();

        System.out.println("Enter power number to raise: ");
        power = scan.nextInt();

        for (int i = 1; i <= power; i++){
            
            result = result * base;

        }

        System.out.println("Result: " + result);

        scan.close();

        System.exit(0);

    }

}

   