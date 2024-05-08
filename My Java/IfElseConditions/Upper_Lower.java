import java.util.Scanner;

public class Upper_Lower {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        char letter;

        System.out.print("Enter a letter: ");
        letter = scan.next().charAt(0);

        if (letter >= 'a' && letter <= 'z') {
            System.out.println("This is a Lowercase Alphabet");
        } else if (letter >= 'A' && letter <= 'Z'){
            System.out.println("This is an Uppercase Alphabet");
        } else {
            System.out.println("This is not in the Alphabet!");
        }

        scan.close();
    }
}
