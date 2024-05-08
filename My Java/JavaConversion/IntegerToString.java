import java.util.Scanner;

public class IntegerToString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int int_val;
        String str;

        System.out.print("Integer Value: ");
        int_val = scan.nextInt();

        str = Integer.toString(int_val);

        System.out.println("Integer to String Value: " + str);

        scan.close();
    }
}
