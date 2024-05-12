package Methods;

import java.util.Scanner;

public class CountTwo {

    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        
        System.out.println("Number of value two: " + countTwo(inputNumber()));

    }

    static int inputNumber(){
        System.out.print("Input a number: ");
        int number = scan.nextInt();

        return Math.abs(number);
    }

    static int countTwo(int number){
        int digits = 0;

        do {
            if(number % 10 == 2){
                digits++;
            }

            number /= 10;
        } while (number > 0);

        return digits;
    }
}
