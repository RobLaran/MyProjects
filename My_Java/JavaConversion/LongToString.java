package JavaConversion;

import java.util.Scanner;

public class LongToString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        long long_val;
        String str;

        System.out.print("Long Value: ");
        long_val = scan.nextLong();

        str = Long.toString(long_val);

        System.out.println("Long to String Value: " + str);

        scan.close();
    }
}
