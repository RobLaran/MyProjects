import java.util.Scanner;

public class Check_Alphabet {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        char letter;

        System.out.print("Enter the Character: ");
        letter = scan.next().charAt(0);

        if (letter >= 'a' && letter <= 'z' || letter >= 'A' && letter <= 'Z') {
            System.out.println("This is an Alphabet");
        }else{
            System.out.println("This is not an Alphabet");
        }

        scan.close();
    }
}
