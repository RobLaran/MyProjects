public class Quicksort {
    public static void main(String[] args) {
        int[] array = {5,1,6,2,3,7,4};

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

        int endPoint = partition(array, firstIndex, lastIndex, pivot);

        quicksort(array, firstIndex, endPoint - 1);
        quicksort(array, endPoint + 1, lastIndex);
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

    private static void swap(int[] array, int leftPointer, int rightPointer){
        int temp = array[leftPointer];
        array[leftPointer] = array[rightPointer];
        array[rightPointer] = temp;
    }
}
