package RecursiveMethods;

import java.util.Scanner;

public class Exponentiation {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        while(true){
        System.out.println("Exponentiation of a number");
        System.out.print("Enter the base of a number: ");
        float num = scan.nextFloat();
        System.out.print("Enter the exponent: ");
        int exp = scan.nextInt();
        
        System.out.println("Result: " + exponent(num, exp) + "\n");
        }
    }

    public static float exponent(float n, int expo){
        if(expo == 0){
            return 1;
        }

        return n * exponent(n, expo - 1); 
    }
}
