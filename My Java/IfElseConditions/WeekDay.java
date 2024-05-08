package IfElseConditions;

import java.util.Scanner;

public class WeekDay {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num;

        System.out.print("Enter the Week Number(1-7) : ");
        num = scan.nextInt();

        if(num == 1){
            System.out.println("This is Sunday");
        } else if(num == 2) {
            System.out.println("This is Monday");
        } else if(num == 3) {
            System.out.println("This is Tuesday");
        } else if(num == 4) {
            System.out.println("This is Wednesday");
        } else if(num == 5) {
            System.out.println("This is Thursday");
        } else if(num == 6) {
            System.out.println("This is Friday");
        } else if(num == 7) {
            System.out.println("This is Saturday");
        } else {
            System.out.println("Enter 1 to 7...");
        }


        scan.close();
    }
}
