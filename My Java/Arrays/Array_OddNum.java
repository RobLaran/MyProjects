import java.util.Scanner;

public class Array_OddNum {
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
        System.out.println("Odd numbers");
         for (int i : arr) {
            if(i % 2 == 1){
                System.out.println(i);
            }
         }
        
        
        scan.close();
    }
}
