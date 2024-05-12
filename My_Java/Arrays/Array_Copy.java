package Arrays;

import java.util.Scanner;

public class Array_Copy {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the Array Limit: ");
        int limit = scan.nextInt();

        int[] arr = new int[limit];
        int[] arr2 = new int[arr.length];

        for(int i = 0; i < limit; i++){
            System.out.print("Element of a[" + i + "] = ");
            arr[i] = scan.nextInt();
            arr2[i] = arr[i];
        }   

        System.out.println();
        System.out.println("Array Original:");

        int num = 0;
        for(int i: arr){
            System.out.println("Element arr1[" + num + "] = " + i);
            num++;
        }

        System.out.println();
        System.out.println("Copy of an Array Original:");
        
        int num2 = 0;
        for(int i: arr2){
            System.out.println("Element arr2[" + num2 + "] = " + i);
            num2++;
        }

        scan.close();
    }
}
