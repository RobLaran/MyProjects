import java.util.Scanner;

public class Divisible_Number {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num;

        System.out.print("Enter number: ");
        num = scan.nextInt();

        if(num % 5 == 0 && num % 11 == 0){
            System.out.println("This Number is Divisible by 5 and 11");
        } else {
            System.out.println("This Number is not Divisible by 5 and 11");
        }


        scan.close();
    }
}
