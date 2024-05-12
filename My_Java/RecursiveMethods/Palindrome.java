package RecursiveMethods;

import java.util.Scanner;

public class Palindrome {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        while(true){
            System.out.println("Check if it is Palindrom or not:");
            System.out.print("Enter string(input): ");
            String string = scan.nextLine();

            System.out.println("Result: " + checkPalindrome(string) + "\n");
        }
    }

    public static boolean checkPalindrome(String str){
        if(str.length() <= 1){
            return true;
        }else if(str.charAt(0) != str.charAt(str.length() - 1)){
            return false;
        }

        String remaining = str.substring(1, str.length() - 1);

        return checkPalindrome(remaining);

    }

}
