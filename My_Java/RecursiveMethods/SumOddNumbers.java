package RecursiveMethods;

import java.util.Arrays;
import java.util.Scanner;

// First, we define a class OddNumberSumCalculator that includes a recursive method calculateOddNumberSum() to find the sum of all odd numbers in an array.

// The calculateOddNumberSum() method has two cases:

// Base case: If the index reaches the end of the array (index == arr.length), we return 0 as there are no more elements to check.

// Recursive case: For any index that is within the bounds of the array, we check if the element at that index is odd. We then recursively call the method with the next index and add the current element to the sum if it is odd. This process continues until we reach the end of the array.

// In the main() method, we demonstrate the calculateOddNumberSum() method by finding the sum of all odd numbers in the array [1, 2, 3, 4, 5, 6, 7, 8, 9] and printing the result.

// Sample Output:

// The sum of all odd numbers in the array is: 25

public class SumOddNumbers {

    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        while(true){
            int[] array = new int[arrayLimit()];
            arrayValue(array);
            printArray(array);
            int sum = calculateOddNumberSum(array, 0);
            System.out.println("The sum of all odd numbers in the array is: " + sum + "\n");
        }
    }

    static int calculateOddNumberSum(int[] arr, int i){
        int oddSum = 0;

        if(i == arr.length){
            return 0;
        }
        if(arr[i] % 2 == 1){
            oddSum += arr[i];
        }
        return oddSum + calculateOddNumberSum(arr, i+1);
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
        System.out.print("Array: " + Arrays.toString(arr) + "\n");
    }
}
