package JavaConversion;

import java.util.Scanner;

public class StringToLong {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        String str;

        System.out.print("Enter a number: ");
        str = scan.next();

        System.out.println("String Value: " + str);

        long lng = 0;

        lng = Long.valueOf(str).longValue();

        System.out.println("Long Value Using longValue() method : " + lng);

        lng = Long.parseLong(str);

        System.out.println("Long Value Using parseLong() method : " + lng);

        scan.close();
    }
}
