package JavaConversion;

import java.util.Scanner;

public class StringToShortInt {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String str;

        System.out.print("Enter a number: ");
        str = scan.next();

        System.out.println("String Value: " + str);

        short short_val = 0;

        short_val = Short.valueOf(str).shortValue();

        System.out.println("Short Value Using shortValue() method : " + short_val);

        short_val = Short.parseShort(str);

        System.out.println("Short Value Using parseShort() method : " + short_val);

        scan.close();
    }
}
