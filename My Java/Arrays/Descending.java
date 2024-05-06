import java.util.Arrays;
import java.util.Collections;

public class Descending {
    public static void main(String[] args) {
        
        Integer[] array = {23, 5, 67, 20, 3, 30, 79, 3, 70, 2};

        System.out.println("Before Array: " + Arrays.toString(array));

        Arrays.sort(array, Collections.reverseOrder());

        System.out.println("After Array:" + Arrays.toString(array));

    }
}
