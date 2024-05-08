package IfElseConditions;

import java.util.Scanner;

public class Check_Incre_Decre {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int first = scan.nextInt();

        System.out.println("Enter second number: ");
        int second = scan.nextInt();

        System.out.println("Enter third number: ");
        int third = scan.nextInt();

        if(first < second && second < third){
            System.out.println("The three numbers are in increasing order!");
        }
        else if(first > second && second > third){
            System.out.println("The three numbers are in decreasing order!");
        }
        else{
            System.out.println("Neither are increasing or decreasing order!");
        }

        
        scan.close();
    }
    
}
