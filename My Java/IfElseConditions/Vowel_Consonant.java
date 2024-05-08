package IfElseConditions;

import java.util.Scanner;

public class Vowel_Consonant {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        char letter;

        System.out.print("Enter Character: ");
        letter = scan.next().toLowerCase().charAt(0);
        
        if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u') {
            System.out.println("This is a Vowel");
        } else {
            System.out.println("This is a Consonant");
        }

        scan.close();
    }
}
