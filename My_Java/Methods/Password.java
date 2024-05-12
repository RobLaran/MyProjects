package Methods;

import java.util.Scanner;

public class Password {

    public static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {

        while(true){

            printInstructions();
    
            String password = inputPassword();
    
            if(leastEightChars(password) && onlyLettersAndDigits(password) && onlyTwoDigits(password) && firstCharIsUpperCase(password)){
                System.out.println("Password is valid: " + password);
            } else {
                System.out.println("Password is invalid: " + password);
            }
        }


    }

    static void printInstructions(){
        System.out.println("1. A password must have at least eight characters and capital letter in first character.");
        System.out.println("2. A password consists of only letters and digits.");
        System.out.println("3. A password must contain at least two digits.");
    }

    static String inputPassword(){
        System.out.print("Input a password (You are agreeing to the above Terms and Conditions.): ");
        String password = scan.nextLine();

        return password;
    }

    static boolean leastEightChars(String pass){
        boolean flag = false;

        for(int i = 0; i < pass.length(); i++){
            if(pass.length() >= 8){
                flag = true;
            } else {
                flag= false;
            }
        }
        return flag;
    }

    static boolean firstCharIsUpperCase(String pass){
        boolean flag = false;
        
        if(pass.charAt(0) == pass.toUpperCase().charAt(0)){
            flag = true;
        } else {
            flag = false;
        }

        return flag;
    }

    static boolean onlyLettersAndDigits(String pass){
        boolean flag = false;
        
        for(int i = 0; i < pass.length(); i++){
            if(pass.charAt(i) >= 'a' && pass.charAt(i) <= 'z' || pass.charAt(i) >= '0' && pass.charAt(i) <= '9'){
                flag = true;
            } else {
                flag = false;
            }
        }

        return flag;
    }

    static boolean onlyTwoDigits(String pass){
        int digits = 0;

        for(int i = 0; i < pass.length(); i++){
            if(pass.charAt(i) >= '0' && pass.charAt(i) <= '9'){
                digits++;
            }
        }

        if(digits >= 2){
            return true;
        } else {
            return false;
        }
    }

}
