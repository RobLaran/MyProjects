import java.util.Arrays;

public class AverageArray {
    public static void main(String[] args) {
        
        int[] array =  {1, 2, 3, 4, 5};
        int sum = 0;

        System.out.println("Array: " + Arrays.toString(array));

        for(int i: array){
            sum += i;
        }

        System.out.println("Sum of Array Value : " + sum);

        sum = sum / array.length;

        System.out.println("Average of Array Value : " + sum);

    }
}
