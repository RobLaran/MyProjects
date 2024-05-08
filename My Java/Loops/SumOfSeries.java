package Loops;

import java.util.Scanner;

public class SumOfSeries {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        int n;
        double sum = 0;

        System.out.println("Enter number: ");
        n = scan.nextInt();

        for (int i = 1; i <= n; i++){
            sum += 1.0/i;
            System.out.println("sum " + i + " : " + " 1.0/" + i + " = " + sum);
        }

        System.out.println("Sum: " + sum);

        scan.close();
    }
}
