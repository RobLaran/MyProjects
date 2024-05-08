package IfElseConditions;

import java.util.Scanner;

public class Negative_Positive {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num;

        System.out.print("Enter Number: ");
        num = scan.nextInt();

        if(num > 0){
            System.out.println("Positive Number");
        } else if(num < 0){
            System.out.println("Negative Number");
        } else {
            System.out.println("Zero Number");
        }

        scan.close();
    }
}
