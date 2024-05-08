package Arrays;

import java.util.Scanner;

public class CheckEqualArrays {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("First Array:");
        int limit1 = promptLimit(scan);
        System.out.println("Second Array:");
        int limit2 = promptLimit(scan);

        int[] array1 = new int[limit1];
        addElements(array1, limit1, scan);
        printArray(array1);


        int[] array2 = new int[limit2];
        addElements(array2, limit2, scan);
        printArray(array2);

        equality_checking_two_arrays(array1, array2);
        
    }

    public static int promptLimit(Scanner scan){
        System.out.println("Enter the limit of the array: ");
        int limit = scan.nextInt();

        return limit;
    }

    public static void addElements(int[] array, int limit, Scanner scan){
        System.out.println("Add elements of the array");
        for(int i = 0; i < limit; i++){
            System.out.print("Element array[" + i + "] = ");
            array[i] = scan.nextInt();
        }
    }

    static void printArray(int[] array){
        System.out.println("Array: ");
        for(int i: array){
            System.out.print(i + " ");
        }
        System.out.println();
    }

    private static void equality_checking_two_arrays(int[] firstArray, int[] secondArray){
        boolean flag = true;

        for(int i = 0; i < firstArray.length; i++){
            if(firstArray[i] != secondArray[i]){
                flag = false;
            }
        }

        if(flag == true){
            System.out.println("Two arrays are equal.");
        } else {
            System.out.println("Two arrays are not equal.");
        }
            
    
    }
}
