package Methods;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {

        multiplicationTable();
        
    }

    public static void multiplicationTable(){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Number for Multiplication Table: ");
        int num = scan.nextInt();
        
        int i = 1;
        while(i <= 10){

            int product = num * i;

            System.out.println("Product Number " + i + " : " +"(" + num + "x" + i + ") = " + product);

            i++;

        }

        scan.close();
    }
}
