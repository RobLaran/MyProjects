import java.util.Scanner;

public class ByteToString{
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Byte Value: ");
        byte b = scan.nextByte();

        String str = Byte.toString(b);

        System.out.println("String Value: " + str);

        scan.close();
    }
}