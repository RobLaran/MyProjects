import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        int num, evenSum = 0, oddSum = 0;
        char response;

        do { 
            System.out.println("Enter an Integer: ");
            num = scan.nextInt();

            if (num % 2 == 0){
            evenSum = evenSum + num;
     
                } else {
            oddSum = oddSum + num;
       
             }

             System.out.print("You want to Continue?: (y/n) ");
             response = scan.next().charAt(0);
             

        } while (response == 'y' || response == 'Y');
        
        System.out.println("Sum of Even Numbers: " + evenSum);

        System.out.println("Sum of Odd Numbers: " + oddSum);

        scan.close();

    }

    
}