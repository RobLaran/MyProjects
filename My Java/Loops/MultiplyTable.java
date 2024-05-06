import java.util.Scanner;

public class MultiplyTable {
    public static void main(String[] args) {

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
