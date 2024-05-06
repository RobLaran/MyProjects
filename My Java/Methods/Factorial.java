package Methods;

import java.util.Scanner;

public class Factorial {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        while(true){
            int value = promptUser();
    
            System.out.println("Result: " + factorial(value));
        }
    }

    static int factorial(int n){
        int total = 1;

        for(int i = 1; i < n; i++){
            total *= n - i;
        }

        return n * total;
    }

    static int promptUser(){
        System.out.print("Enter a number: ");
        int num =  scan.nextInt();

        return num;
    }
}
