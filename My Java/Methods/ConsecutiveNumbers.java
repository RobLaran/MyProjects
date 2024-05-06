package Methods;

import java.util.Scanner;

public class ConsecutiveNumbers {

    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.print("Input first number: ");
        int first = inputNumber();
        System.out.print("Input second number: ");
        int second = inputNumber();
        System.out.print("Input third number: ");
        int third = inputNumber();

        if(checkConsecutive(first, second, third)){
            System.out.println("Check whether the three said numbers are consecutive or not! TRUE");
        } else {
            System.out.println("Check whether the three said numbers are consecutive or not! FALSE");
        }
        
    }

    static int inputNumber(){
        
        int number = scan.nextInt();

        return number;

    }

    static boolean checkConsecutive(int num1, int num2, int num3){

        if(num2 == num1 + 1 && num3 == num2 + 1 || num2 == num1 - 1 && num3 == num2 - 1){
            return true;
        }

        return false;

    }
}
