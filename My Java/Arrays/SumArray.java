package Arrays;

import java.util.Arrays;

public class SumArray {
    public static void main(String[] args) {
        
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;

        System.out.println("Array: " + Arrays.toString(array));

        for(int i: array){
            sum += i;
        }

        System.out.println("Sum of an Array: " + sum);

    }
}
