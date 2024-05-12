package Arrays;

import java.util.Scanner;

public class Array_Sum_Negative {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter the Array Limit: ");
        int limit = scan.nextInt();

        int[] arr = new int[limit];
        int negative = 0;

        for(int i = 0; i < limit; i++){
            System.out.print("Element a[" + i + "] = ");
            arr[i] = scan.nextInt();
            if(arr[i] < 0){
                negative += arr[i];
            }
        }

        System.out.println();

        System.out.println("Sum of the Negative Element of an Array: " + negative);


        scan.close();
    }
}
