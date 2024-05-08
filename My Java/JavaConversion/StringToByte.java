package JavaConversion;

import java.util.Scanner;

public class StringToByte {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String str = null;

        System.out.print("Enter the Number: ");
        str = scan.next();

        System.out.println("String Value " + str);

        byte byte_val;

        byte_val = Byte.valueOf(str).byteValue();

        System.out.println("Byte value Using byteValue() Method : " + byte_val);

        byte_val = Byte.parseByte(str);

        System.out.println("Byte value Using parseByte() Method : " + byte_val);

        scan.close();
    }
}
