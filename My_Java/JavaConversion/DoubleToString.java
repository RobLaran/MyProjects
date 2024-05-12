package JavaConversion;

import java.util.Scanner;

public class DoubleToString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        double db_val;
        String str;

        System.out.print("Double Value: ");
        db_val = scan.nextDouble();

        str = Double.toString(db_val);

        System.out.println("Double to String Value: " + str);

        scan.close();
    }
}
