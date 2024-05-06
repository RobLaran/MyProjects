public class Quicksort {
    public static void main(String[] args) {
        int[] array = {1,32,60,7,4,10,54,24,8,20,66,2};

        System.out.println("Before QuickSorting the Array: ");
        for (int i : array) {
            System.out.print(i + " ");
        }

        quicksort(array, 0, array.length - 1);

        System.out.println("\n"+"QuickSorted Array: ");
        
        for (int i : array) {
            System.out.print(i + " ");
        }
    }

    private static void quicksort(int[] array, int firstIndex, int lastIndex){
        if (firstIndex >= lastIndex) {
            return;
        }

        int pivot = array[lastIndex];

        int leftPointer = partition(array, firstIndex, lastIndex, pivot);

        quicksort(array, firstIndex, leftPointer - 1);
        quicksort(array, leftPointer + 1, lastIndex);
    }

    private static int partition(int[] array, int firstIndex, int lastIndex, int pivot){
        int leftPointer = firstIndex;
        int rightPointer = lastIndex;

        while (leftPointer < rightPointer) {
            while (array[leftPointer] <= pivot && leftPointer < rightPointer) {
                leftPointer++;
            }
            while (array[rightPointer] >= pivot && leftPointer <  rightPointer) {
                rightPointer--;
            }
            swap(array, leftPointer, rightPointer);
        }

        swap(array, leftPointer, lastIndex);
        return leftPointer;
    }

    private static void swap(int[] array, int index1, int index2){
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
}
