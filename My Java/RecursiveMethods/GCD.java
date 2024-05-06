package RecursiveMethods;

import java.util.Scanner;

// First, we define a class GCDCalculator that includes a recursive method calculateGCD() to find the greatest common divisor (GCD) of two numbers.

// The calculateGCD() method follows the recursive GCD definition. It has two cases:

// Base case: If the second number (num2) is 0, the GCD is the first number (num1). This is because any number divided by 0 is the number itself.

// Recursive case: For any two numbers (num1 and num2), we calculate the remainder when num1 is divided by num2. We then recursively call the method with num2 as the new num1 and the remainder as num2. This process continues until num2 reaches 0.

// In the main() method, we demonstrate the calculateGCD() method by finding the GCD of two numbers (16 and 18) and printing the result.

public class GCD {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter first number: ");
        int firstNum = scan.nextInt();

        System.out.print("Enter second number: ");
        int secondNum = scan.nextInt();

        int result = calcGCD(firstNum, secondNum);

        System.out.println("The GCD of " + firstNum + " and " + secondNum + " is: " + result);
    }

    static int calcGCD(int num1, int num2){
        if(num2 == 0){
            return num1;
        }

        int remainder = num1 % num2;

        return calcGCD(num2, remainder);        
    }
}
