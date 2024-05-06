package RecursiveMethods;

import java.util.Scanner;

public class ReverseString {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        while (true) {
            System.out.println("Reversing a String");
            System.out.print("Enter a string(word/s): ");
            String stri = scan.nextLine();

            String reversed = reverse(stri);

            System.out.println("Result: " + reversed + "\n");
        }
    }

    public static String reverse(String str){
        if(str.isEmpty() || str.length() == 1){
            return str;
        }

        return reverse(str.substring(1)) + str.charAt(0);
    }
}
