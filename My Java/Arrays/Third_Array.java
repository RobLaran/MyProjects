package Arrays;

import java.util.Scanner;

public class Third_Array {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Limit1 : ");
        int limit1 = scan.nextInt();

        System.out.print("Limit2 : ");
        int limit2 = scan.nextInt();

        int[] arr1 = new int[limit1];
        int[] arr2= new int[limit2];
        int k = 0;
        int[] arr3 = new int[limit1 + limit2];

        System.out.println();
        System.out.println("First Array:");

        for(int i = 0; i < limit1; i++){
            System.out.print("Element a1[" + i + "] = ");
            arr1[i] = scan.nextInt();
            arr3[k] = arr1[i];
            k++;
        }       

        System.out.println();
        System.out.println("Second Array:");

        for(int i = 0; i < limit2; i++){
            System.out.print("Element a2[" + i + "] = ");
            arr2[i] = scan.nextInt();
            arr3[k] = arr2[i];
            k++;
        }

        System.out.println();
        System.out.println("Third Array:");

        for(int i = 0; i < k; i++){
            System.out.println("Element of a3[" + i + "] = " + arr3[i]);
        }

        scan.close();

    }
}
