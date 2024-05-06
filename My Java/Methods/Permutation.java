package Methods;

import java.util.Scanner;

public class Permutation {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        while (true) {
            promptUser();
        }
    }

    static int permutationValue(int n, int r){
        return factorial(n) / factorial(n - r);
    }

    static int factorial(int v){
        int total = 1;

        for(int i = 1; i < v; i++){
            total *= v - i;
        }

        return v * total;
    }

    static void promptUser(){
        System.out.print("Enter the value of n: ");
        int n = scan.nextInt();

        System.out.print("Enter the value of r: ");
        int r  = scan.nextInt();

        int result = permutationValue(n, r);

        System.out.println("Result: " + result);
    }
}
