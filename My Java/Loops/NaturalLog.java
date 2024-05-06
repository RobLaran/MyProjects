import java.util.Scanner;

public class NaturalLog {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        int n, sign = 1;
        double sum = 0;
        

        System.out.println("Enter a number");
        n = scan.nextInt();

        for (int i = 1; i <= n; i++){
            sum += (1.0 * sign) / i; 
            sign *= -1;
        }

        System.out.println("Log2 :" + sum);

        scan.close();

    }
}
