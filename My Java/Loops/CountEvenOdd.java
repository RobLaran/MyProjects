import java.util.Scanner;

public class CountEvenOdd {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int even = 0, odd = 0, num = 0, i = 1;
        
        while (i <= 5) {
            System.out.print("enter number: ");
            num = scan.nextInt();
            
            if(num % 2 == 0){
                System.out.println("even");
                even = even + 1;
            } else if (num % 2 == 1) {
                System.out.println("odd");
                odd = odd + 1;
            }
            i = i + 1;
        }
            System.out.println("odd: " + odd);
            System.out.println("even: " + even);

        scan.close();
    }
}
