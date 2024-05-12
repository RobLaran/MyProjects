package Methods;

import java.util.Scanner;

public class CheckStringVowel {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        
        System.out.println("Check all the characters of the said string are vowels or not! " + checkVowels(inputString()));

    }

    static String inputString(){
        System.out.print("Input a string: ");
        String value = scan.nextLine();

        return value.toLowerCase();
    }

    static boolean checkVowels(String str){
        String vowels = "aeiou";

        for(int i = 0; i < str.length(); i++){
            if(vowels.indexOf(str.charAt(i)) == -1){
                return false;
            }
        }

        return true;
    }

}
