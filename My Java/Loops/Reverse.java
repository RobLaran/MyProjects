import java.util.Scanner;
public class Reverse {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a number to reverse the number: ");
        int num = scan.nextInt();
        
        int temp = num, remainder, reverse = 0;

        while (temp > 0){
            remainder = temp % 10;
            reverse = reverse * 10 + remainder;
            temp = temp / 10;
        }

        System.out.println("Original Number: " + num);
        System.out.println("Reversed Number: " + reverse);

        scan.close();


    }
}
