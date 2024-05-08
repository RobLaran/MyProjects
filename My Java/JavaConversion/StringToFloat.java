package JavaConversion;

import java.util.Scanner;

public class StringToFloat {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        String str;

        System.out.print("Enter a number: ");
        str = scan.next();

        System.out.println("String Value: " + str);

        float fl = 0;

        fl = Float.valueOf(str).floatValue();

        System.out.println("Float Value Using floatValue() method : " + fl);

        fl = Float.parseFloat(str);

        System.out.println("Float Value Using parseFloat() method : " + fl);

        scan.close();
    }
}
