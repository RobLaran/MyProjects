package Loops;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        int num;
        char response;
        boolean flag = true;

        do {
            System.out.print("Enter any Positive Number: ");
            num = scan.nextInt();

            for(int i = 2; i < num; i++){

                if (num % i == 0){
                flag = false;
                break;
                }
            }

            if (flag && num > 1){
                System.out.println(num + " is a Prime Number");
            } else {
                System.out.println(num + " is not a Prime Number");
            }

            System.out.println("Continue(y/n): ");
            response = scan.next().charAt(0);

        } 
        while (response == 'y' || response == 'Y');
        
        
        scan.close();

    }
}
