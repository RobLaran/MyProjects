package Methods;

import java.util.Scanner;

public class CheckAllDigitsEven {
    
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        
        System.out.println("Check whether every digit of the said integer is even or not! " + checkDigitEven(inputInteger()));

    }

    static int inputInteger(){
        System.out.print("Input an integer: ");
        int value = scan.nextInt();

        return value;
    }

    static boolean checkDigitEven(int number){
        int x = Math.abs(number); 
        boolean flag;
        
        do{
            if(x % 2 == 0){
                x /= 10;
                flag = true;
            } else {
                flag = false;
                break;
            }
        } while (x > 0);

        return flag;

    }
}
