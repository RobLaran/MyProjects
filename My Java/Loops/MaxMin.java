import java.util.Scanner;

public class MaxMin {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        int num;
        int large = Integer.MIN_VALUE;
        int small = Integer.MAX_VALUE;
        char response;

        do {
            System.out.print("Enter Number: ");
            num = scan.nextInt();

            if (num > large){
                large = num;
            } 

            if (num < small){
                small = num;
            }

            System.out.println("Continue: y/n ");
            response = scan.next().charAt(0);

        } while (response == 'y' || response == 'Y');
        
        System.out.println("Largest: " + large);
        System.out.println("Smallest: " + small);



        scan.close();

    }
}
