package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayToArrayList {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Integer[] array = {1,2,3,4,5};

        ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(array));

        System.out.println(numbers);

        scan.close();
    }
}
