package Arrays;

import java.util.Scanner;

public class Array_Sum_EvenNum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the Array Limit: ");
        int limit = scan.nextInt();

        int[] arr = new int[limit];

        for(int i = 0; i < limit; i++){
            System.out.print("Element a[" + i + "] = ");
            arr[i] = scan.nextInt();
        }
        
        int even = 0;

        System.out.println();
        System.out.println("Even Numbers: ");
        for(int i: arr){
            if(i % 2 == 0){
                System.out.println(i);
                even += i;
            }
        }

        System.out.println("Sum of Even Numbers: " + even);

        scan.close();
    }
}
