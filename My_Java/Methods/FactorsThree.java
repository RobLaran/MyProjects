package Methods;

import java.util.Scanner;

public class FactorsThree {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        checkFactor(inputNumber());

    }

    static int inputNumber(){
        System.out.print("Input an integer(positive/negative): ");
        int value = scan.nextInt();

        return value;
    }

    static void checkFactor(int number){
        int result = number;

        System.out.print("Factors of 3 of the said integer: ");
        System.out.print(result + " = ");

        while(result % 3 == 0){
            System.out.print("3 * ");
            result /= 3;
        }

        System.out.print(result);
    }
}
