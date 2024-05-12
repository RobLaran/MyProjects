package JavaConversion;

import java.util.Scanner;

public class FloatToString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        float float_val;
        String str;

        System.out.print("Float Value: ");
        float_val = scan.nextFloat();

        str = Float.toString(float_val);

        System.out.println("Float to String Value: " + str);

        scan.close();
    }
}
