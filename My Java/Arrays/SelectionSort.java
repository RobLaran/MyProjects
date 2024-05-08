public class SelectionSort {
    public static void main(String[] args) {
        int[] array = {3, 5, 1 ,6, 2};

        System.out.println("Before Selection Sorting the Array: ");
        for (int i : array) {
            System.out.print(i + " ");
        }

        selectionSort(array);

        System.out.println("\n" + "After Selection Sorting the Array: ");
        for (int i : array) {
            System.out.print(i + " ");
        }
    }

    private static void selectionSort(int[] array) {
        for(int i = 0; i < array.length - 1; i++){
            int minValue = array[i];  // value 1
            int indexOfMinValue = i;  // index 2
            for(int j = i + 1; j < array.length; j++){ // index 4
                if(array[j] < minValue){ // value 2
                    minValue = array[j];
                    indexOfMinValue = j;
                }
            }
            swap(array, i, indexOfMinValue); 
        }
    }

    private static void swap(int[] array, int i, int indexOfMinValue) {
        int temp = array[i];
        array[i] = array[indexOfMinValue];
        array[indexOfMinValue] = temp;
    }
}
