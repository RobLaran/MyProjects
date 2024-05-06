package Methods;

import java.util.Arrays;

public class MeanMedianModeRange {
    public static void main(String[] args) {
        
        int[] nums = {65, 13, 42, 71, 5, 84, 2};

        System.out.println("List of numbers: " + Arrays.toString(nums));

        meanValue(nums);

        medianValue(nums);

        modeValue(nums);

        rangeValue(nums);
        
    }

    public static void meanValue(int[] array){
        // Mean: Sum of the values divided by the number of values.

        int sum = 0;

        for(int i = 0; i < array.length; i++){
            sum += array[i];
        }

        double average = (double) sum / array.length;

        System.out.println("Mean: " + average);
    }

    public static void medianValue(int[] array){
        // Median: The middle of the number of values is the median.

        Arrays.sort(array);

        if(array.length % 2 == 0){
            int mid = array.length / 2;

            double median = (double)(array[mid - 1] + array[mid]) / 2;

            System.out.println("Median: " + median);
        } else if (array.length % 2 == 1){
            int mid = (array.length - 1) / 2;

            System.out.println("Median: " + array[mid]);
        }
    } 

    public static void modeValue(int[] array){
        // Mode: ALl common values are mode values if there is no common values then all of that values are mode values itself.

        Arrays.sort(array);
        boolean flag = true;

        System.out.print("Mode: ");

        for(int i = 0; i < array.length - 1; i++){
            if(array[i] == array[i + 1]){
                System.out.print(array[i] + " ");
                flag = false;
            } 

            if(i == array.length - 2 && flag){
                for(int h : array){
                    System.out.print(h + " ");
                }
            }
        }
    }

    public static void rangeValue(int[] array){
        // Range: The last values will be subtracted by the first value then that woill be the range value.

        System.out.println();
        Arrays.sort(array);

        double range = array[array.length - 1] - array[0];

        System.out.println("Range: " + range);
    }
}
