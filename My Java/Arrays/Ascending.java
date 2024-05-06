import java.util.Arrays;

public class Ascending {
    public static void main(String[] args) {
        
        int[] array =  {23, 5, 67, 20, 3, 30, 79, 3, 70, 2};

        System.out.println("Before Array: " + Arrays.toString(array));
        
        Arrays.sort(array);
        
        System.out.println("After Array: " + Arrays.toString(array));
    
    }
}