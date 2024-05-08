import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter first Number: ");
        int first = scan.nextInt();

        System.out.print("Enter second Number: ");
        int second = scan.nextInt();

        System.out.print("Choose an operator to calculate(*, /, +, -): ");
        char opt = scan.next().charAt(0);

        double result = 0;

        if(opt == '*'){
            result = first * second;
        }
        else if(opt == '/'){
            result = first / second;
        }
        else if(opt == '+'){
            result = first + second;
        }
        else if(opt == '-'){
            result = first - second;
        } else {
            System.out.println("Please enter the right operator!");
        }

        System.out.println("First Number: " + first);
        System.out.println("Second Number: " + second);
        System.out.println("Operator: " + opt);
        System.out.println("Result: " + result);

        scan.close();
    }
}
