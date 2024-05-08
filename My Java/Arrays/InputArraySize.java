package Arrays;

import java.util.Scanner;

public class InputArraySize {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.print("Input size of an Array: ");
        int in = scan.nextInt();

        int[] array = new int[in];

        for(int i = 0; i < array.length; i++){
            array[i] = 10 * (i + 1) ; 
        }
        
        for(int i = 0; i < array.length; i++){
            System.out.println("Element of array[" + i + "] = " + array[i]);
        }

        System.out.println("\n" + "Display Array Elements");

        for(int i: array){
            System.out.println(i);
        }

        scan.close();

    }
}
