import java.util.Scanner;

public class ShortIntToString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        short short_val;
        String str;

        System.out.print("Enter a Short Value: ");
        short_val = scan.nextShort();

        str = Short.toString(short_val);

        System.out.println("String Value: " + str);

        scan.close();
    }
}
