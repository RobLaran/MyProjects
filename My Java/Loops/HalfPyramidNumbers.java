package Loops;

import java.util.Scanner;

public class HalfPyramidNumbers {
     public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        for (int i = 1; i <= 5; i++){
            for (int j = 1; j <= i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
        
        console.close();

    }
}
