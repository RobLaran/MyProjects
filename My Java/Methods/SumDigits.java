package Methods;

import java.util.Scanner;

public class SumDigits {

    public static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        int numbers = 0;

        numbers = inputNumbers(numbers);

        System.out.println("The sum of all digits: " + sumOfDigits(numbers));
    }

    static int inputNumbers(int numbers){
        System.out.print("Enter number: ");
        return numbers = scan.nextInt();
    }

    private static int sumOfDigits(int numbers){
        int sum = 0;
        String stringNumbers = Integer.toString(numbers);

        int[] numberDigits = new int[stringNumbers.length()];

        for(int i = 0; i < numberDigits.length; i++){
            numberDigits[i] = Character.getNumericValue(stringNumbers.charAt(i));
            sum += numberDigits[i];
        }
        
        return sum;
    }
}
