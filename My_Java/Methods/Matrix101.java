package Methods;

import java.util.Scanner;

public class Matrix101 {

    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {

        displayMatrix(inputNumber());

    }

    static int inputNumber(){

        System.out.print("Input a number: ");
        int number = scan.nextInt();

        return number;

    }

    static void displayMatrix(int input){

        for(int i = 0; i < input; i++){
            for(int j = 0; j < input; j++){
                System.out.print(Math.round(Math.random()) + " ");
            }
            System.out.println();
        }
        
    }
}
