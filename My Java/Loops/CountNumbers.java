package Loops;

import java.util.Scanner;

public class CountNumbers {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        int num, positiveNum = 0,negativeNum = 0, zeros = 0;
        char response;

        do{
            System.out.print("Enter Any Number 0-9: ");
            num = scan.nextInt();

            if (num > 0){
                positiveNum++;
            } else if (num < 0){
                negativeNum++;
            } else {
                zeros++;
            }

            System.out.println("Positive Numbers: " + positiveNum);
            System.out.println("Negative Numbers: " + negativeNum);
            System.out.println("Zero Numbers: " + zeros);

            System.out.println("Continue: ");
            response = scan.next().charAt(0);

        } while (response == 'y' || response == 'Y');


        scan.close();

    }
}