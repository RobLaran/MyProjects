import java.util.Scanner;

public class Three_Maximum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num1 = 0, num2 = 0, num3 = 0;

        System.out.print("Enter First Number: ");
        num1 = scan.nextInt();

        System.out.print("Enter Second Number: ");
        num2 = scan.nextInt();

        System.out.print("Enter Third Number: ");
        num3 = scan.nextInt();

        if(num1 > num2 && num1 > num3){
            System.out.println("Maximum Number is First Number =  " + num1);
        }else if(num2 > num1 && num2 > num3){
            System.out.println("Maximum Number is Second Number = " + num2);
        }else {
            System.out.println("Maximum Number is Third Number = " + num3);
        }
        
       scan.close();
    }
}
