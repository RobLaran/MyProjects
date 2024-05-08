package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class SumElementsOfArray {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int in, sum = 0;        
        in = scan.nextInt();
        
        int[] array = new int[in];

        for(int i = 0; i < array.length; i++){
            array[i] = 10 * (i + 1);
        }

        System.out.println("Array = " + Arrays.toString(array));

        for(int i: array){
            sum += i;
        }

        System.out.println("\n" + "Sum of Array Elements = " + sum);

        scan.close();

    }
}
