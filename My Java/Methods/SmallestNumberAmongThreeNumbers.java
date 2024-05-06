package Methods;

import java.util.Scanner;

public class SmallestNumberAmongThreeNumbers {

    public static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        int firstNumber = 0, secondNumber = 0, thirdNumber = 0;

        firstNumber = inputNumbers(firstNumber);
        secondNumber = inputNumbers(secondNumber);
        thirdNumber = inputNumbers(thirdNumber);

        findingSmallest(firstNumber, secondNumber, thirdNumber);
    }

    static int inputNumbers(int number){
        System.out.print("Input Number: ");
        number = scan.nextInt();
        return number;
    }

    private static void findingSmallest(int number, int nextNumber, int lastNumber){
        if(number < nextNumber && number < lastNumber){
            System.out.println("The smallest value is " + number);
        } else if(nextNumber < number && nextNumber < lastNumber){
            System.out.println("The smallest value is " + nextNumber);
        } else {
            System.out.println("The smallest value is " + lastNumber);
        }
    }
}
