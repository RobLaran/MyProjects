package Arrays;

import java.util.Arrays;

public class Array_FindDuplicates {
    public static void main(String[] args) {
        int[] array = {1, 2, 5, 5, 6, 6, 7, 2};

        System.out.print("Elements of the Array: ");
        for(int i: array){
            System.out.print(i + " ");
        }

        System.out.println();
        findDuplicates(array);
    }

    private static void findDuplicates(int[] array) {
        Arrays.sort(array);

        System.out.print("Duplicates: ");
        for(int i = 0; i < array.length - 1; i++){
            if(array[i] == array[i + 1]){
                System.out.print(array[i] + " ");
            }
        }
        
    }
}
