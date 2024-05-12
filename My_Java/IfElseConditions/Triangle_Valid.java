package IfElseConditions;

import java.util.Scanner;

public class Triangle_Valid {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int sum = 0, angle= 0;

        System.out.println("Enter three angle: ");
        for (int i = 1; i <= 3; i++){
            System.out.print("Angle " + i + ": ");
            angle += scan.nextInt();
        }

        sum = angle;

        if(sum == 180 && angle >= 0){
            System.out.println("Triangle is valid");
        } else {
            System.out.println("Triangle is not valid");
        }

        System.out.println("Sum of three angles: " + sum);


        scan.close();
    }
}
