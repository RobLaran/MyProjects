package RecursiveMethods;

import java.util.Arrays;

public class ArraySortChecker {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {4, 5, 3, 2, 1};

        System.out.println("Original of the First Array: " + Arrays.toString(array1));
        System.out.println("Is the Second Array is Sorted? " + isSorted(array1));

        System.out.println("Original of the Second Array: " + Arrays.toString(array2));
        System.out.println("Is the Second Array is Sorted? " + isSorted(array2));
        
    }

    static boolean isSorted(int[] arr){
        return isSorted(arr, 0);
    }

    static boolean isSorted(int [] arr, int index){
        if(index == arr.length - 1){
            return true;
        }

        if(arr[index] > arr[index + 1]){
            return false;
        }

        return isSorted(arr, index + 1);
    }
}
