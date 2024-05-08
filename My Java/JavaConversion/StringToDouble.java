package JavaConversion;

import java.util.Scanner;

public class StringToDouble {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        String str;

        System.out.print("Enter a number: ");
        str = scan.next();

        System.out.println("String Value: " + str);

        double db = 0;

        db= Double.valueOf(str).doubleValue();

        System.out.println("Double Value Using doubleValue() method : " + db);

        db= Double.parseDouble(str);

        System.out.println("Double Value Using parseDouble() method : " + db);

        scan.close();
    }
}
