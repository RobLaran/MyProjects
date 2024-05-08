package IfElseConditions;

import java.util.Scanner;

public class MaximumNumber{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num1, num2;
        
        System.out.print("Enter First NUmber: ");
        num1 = scan.nextInt();

        System.out.print("Enter Second Number: ");
        num2 = scan.nextInt();

        if(num1 > num2){
            System.out.println("Maximum Number is " + num1);
        }


        scan.close();
    }
}