package Methods;

import java.util.Scanner;

public class MidChar {

    public static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {

        while(true){
            String strings = " ";

            strings = inputString(strings);
    
            displayMidChar(strings);
        }

        
    }

    static String inputString(String strings){
        System.out.print("Input a string: ");
        return strings = scan.nextLine(); 
    }

    static void displayMidChar(String strings){
        if(strings.length() % 2 == 1){
            int midChar = strings.length() / 2;

            System.out.println("The middle character in the string: " + strings.charAt(midChar));
        } else if (strings.length() % 2 == 0){
            
            int midChar = (strings.length() - 1) / 2;

            System.out.println("The middle character in the string: " + strings.charAt(midChar) + "" + strings.charAt(midChar + 1));
        }
    }

}
