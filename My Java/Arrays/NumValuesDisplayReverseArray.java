
import java.util.Scanner;

public class NumValuesDisplayReverseArray {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        int in;

        System.out.print("Enter the Array Size = ");
        in = scan.nextInt();

        int[] array = new int[in];

        for(int i = 0; i < array.length; i++){
            array[i] = i + 1;
        }

        for(int i = 0; i < array.length; i++){
            System.out.println("Element of array[" + i + "] = " + array[i]);
        }

        System.out.println("\n" + "Display Reverse Order");

        for(int i = array.length - 1; i >= 0; i--){
            System.out.println(array[i]);
        }

        scan.close();

    }
}
