package Methods;

import java.util.Scanner;

public class CheckLeapYear {

    public static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        
        System.out.print("Enter a Year: ");
        int year = scan.nextInt();

        checkLeapYear(year);

    }

    static void checkLeapYear(int year){
        if(year % 400 == 0 || year % 4 == 0){
            System.out.println("It is a Leap Year!");
        } else if (year % 100 == 0){
            System.out.println("It is not a Leap Year!");
        } else {
            System.out.println("It is not a Leap Year!");
        }
    }

}
