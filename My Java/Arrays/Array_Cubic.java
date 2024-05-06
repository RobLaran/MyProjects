import java.util.Scanner;

public class Array_Cubic {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);;

        System.out.print("Enter the array limit: ");
        int num = scan.nextInt();
        
        int[] arr = new int[num];

        for(int i = 0; i < num; i++){
            System.out.print("Element of array[" + i + "] = ");
            arr[i] = scan.nextInt();
        }
        
        for(int j = 0; j < num; j++){
            arr[j] = arr[j] * arr[j] * arr[j];
            System.out.println("Cubic value of array[" + j + "] = " + arr[j]);
        }
        
        scan.close();
        
    }
}
