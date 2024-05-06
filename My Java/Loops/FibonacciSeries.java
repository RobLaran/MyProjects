
import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        int num;
        int first = 0;
        int second = 1;
        int third;

        System.out.println("Enter number for Fibonacci Sequence: ");
        num = scan.nextInt();

        System.out.print(first + " " + second + ' ');

        for (int i = 3; i <= num; i++){

            third = first + second;
            System.out.print(third + " ");
            first = second;
            second = third;
        }




        scan.close();
    }
}
