package JavaConversion;

import java.util.Scanner;

public class StringToInt {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        String str;

        System.out.print("Enter a number: ");
        str = scan.next();

        System.out.println("String Value: " + str);

        int inte = 0;

        inte= Integer.valueOf(str).intValue();

        System.out.println("Integer Value Using intValue() method : " + inte);

        inte= Integer.parseInt(str);

        System.out.println("Integer Value Using parseInt() method : " + inte);

        scan.close();
    }
}
