import java.util.Scanner;

public class Leap_Year {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int year;
        boolean flag;

        System.out.print("Enter a year: ");
        year = scan.nextInt();

        if(year % 400 == 0 || year % 4 == 0){
            flag = true;
        } else if(year % 100 == 0){
            flag = false;
        }
        else {
            flag = false;
        }

        if(flag){
            System.out.println("Year " + year + " is a Leap Year");
        }else{
            System.out.println("Year " + year + " is not a Leap Year");
        }

        scan.close();
    }
}
