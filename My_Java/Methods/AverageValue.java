package Methods;

import java.util.Scanner;

public class AverageValue {

    public static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        int firstNumber = 0, secondNumber = 0, thirdNumber = 0;
        
        firstNumber = inputNumbers(firstNumber); 
        secondNumber = inputNumbers(secondNumber);
        thirdNumber = inputNumbers(thirdNumber);

        averageValue(firstNumber, secondNumber, thirdNumber);
        
    }

    static int inputNumbers(int number){
        System.out.print("Input a number: ");
         return number = scan.nextInt();
    }

    private static void averageValue(int firstNumber, int secondNumber, int thirdNumber){
        double average;
        average = (firstNumber + secondNumber + thirdNumber) / 3;

        System.out.println("Average value is " + average);
    }
}
