package RecursiveMethods;

import java.util.Arrays;
import java.util.Scanner;

// First, we define a class "ArrayElementCounter" that includes a recursive method countOccurrences() to count the number of occurrences of a specific element target in an array arr.

// The countOccurrences() method has two cases:

// Base case: If the index reaches the end of the array (index == arr.length), we return 0 as there are no more elements to check.

// Recursive case: For any index that is within the bounds of the array, we check if the element at that index is equal to the target. We then recursively call the method with the next index and add 1 to the count if the element is equal to the target. This process continues until we reach the end of the array.

// In the main() method, we demonstrate the usage of the countOccurrences() method by counting the number of occurrences of the number 20 in the array {10, 20, 30, 40, 20, 50, 20, 60}and printing the result.

// Sample Output:

// The number of occurrences of 20 in the array is: 3

public class ArrayElementCounter {

    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        while (true) {
            int[] array = new int[arrayLimit()];
            arrayValue(array);
            printArray(array);
            int value = valueToFind();
            int common = countCommon(array,value,0);
            System.out.println("The number of occurrences of " + value + " in the array is: " + common + "\n");
        }
    }

    static int arrayLimit(){
        System.out.print("Enter the array limit: ");
        int limit = scan.nextInt();
        return limit;
        }

    static void arrayValue(int[] arr){
        System.out.println("Enter array element: ");
        for(int i = 0; i < arr.length; i++){
            System.out.print("Array[" + i + "] = ");
            arr[i] = scan.nextInt();
        }
    }

    static void printArray(int[] arr){
        System.out.print("Array: " + Arrays.toString(arr));
    }

    static int valueToFind(){
        System.out.print("\n" + "Enter value to find common value: ");
        int find = scan.nextInt();
        return find;
    }

    // Recursion Method
    static int countCommon(int[] arr, int value, int i){
        int count = 0;
        if(i == arr.length){
            return 0;
        }

        if(value == arr[i]){
            count++;
        } 
        return count + countCommon(arr, value, i + 1);
    }

    
}
