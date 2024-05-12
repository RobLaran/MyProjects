package IfElseConditions;

import java.util.Scanner;

public class EvenOddIf {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num;

        System.out.print("Enter number: ");
        num = scan.nextInt();

        if(num % 2 == 0){
            System.out.println("Even Number");
        } else {
            System.out.println("Odd Number");
        }

        scan.close();
    }
}
