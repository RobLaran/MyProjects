package RecursiveMethods;

import java.util.Arrays;

// First, we define a class ArrayMaxElementFinder that includes a recursive method findMaxElement() to find the maximum element in an array.

// The findMaxElement() method has two cases:

// Base case: If the left and right indices are equal, we have a single element and return it as the maximum element.

// Recursive case: For any array with more than one element, we divide the array into two halves by finding the middle index. We then recursively find the maximum element in each half by calling the method with the appropriate indices. Finally, we return the higher value of the two maximums obtained from the recursive calls.

// In the main() method, we demonstrate the findMaxElement() method by finding the maximum element in the array [34, 45, 34, 23, 56, 62, 27, 55] and printing the result.

// Sample Output:

// Original Array: [34, 45, 34, 23, 56, 62, 27, 55]
// The maximum element in the array is: 62

public class ArrayMaxElementFinder {
    public static void main(String[] args) {
        int[] array = {
            34,
            45,
            34,
            23,
            56,
            62,
            27,
            55
          };
        System.out.println("Original Array: " + Arrays.toString(array));
        int maxElement = findMaxElement(array);
        System.out.println("The maximum element in the array is: " + maxElement);

    }

    static int findMaxElement(int[] arr, int firstIndex, int lastIndex){
        if(firstIndex == lastIndex){
            return arr[firstIndex];
        }

        int midIndex = (firstIndex + lastIndex) / 2;
        int maxLeft = findMaxElement(arr, firstIndex, midIndex);
        int maxRight = findMaxElement(arr, midIndex + 1, lastIndex);

        return Math.max(maxLeft, maxRight);
    }

    static int findMaxElement(int[] arr){
        return findMaxElement(arr, 0, arr.length - 1);
    }
}
