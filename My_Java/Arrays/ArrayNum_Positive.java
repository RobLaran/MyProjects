package Arrays;

import java.util.Scanner;

public class ArrayNum_Positive {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the Array Limit: ");
        int limit = scan.nextInt();

        int[] arr = new int[limit];

        for(int i = 0; i < limit; i++){
            System.out.print("Element of a[" + i + "] = ");
            arr[i] = scan.nextInt();
        }

        System.out.println();
        System.out.println("Positive element in the Array:");
        
        for (int i : arr) {
            if(i > 0){
                System.out.println(i);
            }
        }

        scan.close();
    }
}
