import java.util.Scanner;

public class Alpha_Num_Spl {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        char charac;

        System.out.print("Enter  Character : ");
        charac = scan.next().charAt(0);

        if (charac >= 'a' && charac <= 'z' || charac >= 'A' && charac <= 'Z') {
            System.out.println("This is an Alphabet");
        } else if (charac >= '0' && charac <= '9'){
            System.out.println("This is a Number");
        } else {
            System.out.println("This is a Special Character");
        }

        scan.close();
    }
}
