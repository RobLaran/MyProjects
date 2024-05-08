package Loops;

import java.util.Scanner;

public class HalfStarPyramid {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        
        char star = '*';
        int limit = 8;

        for (int i = 1; i <= limit; i++){
            for (int j = 1; j <= i; j++){
                System.out.print(star + " ");
            }
            System.out.println();
        }
        
        console.close();

    }
}
