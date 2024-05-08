package Arrays;

import java.util.Scanner;

public class Array_Max_Min {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the Array Limit: ");
        int limit = scan.nextInt();

        int[] arr = new int[limit];
        

        for(int i = 0; i < limit; i++){
            System.out.print("Element of array[" + i + "] = ");
            arr[i] = scan.nextInt();
        }
        
        int max = 0;
        int min = 0;
        
        max = arr[0];
        min = arr[0];

        for(int i = 0; i < limit; i++){
            if(max < arr[i]){
                max = arr[i];
            }
            if(min > arr[i]){
                min = arr[i];
            }
        }

        System.out.println("Maximum Element of Array : " + max);
        System.out.println("Minimum Element of Array : " + min);

        scan.close();
    }
}
