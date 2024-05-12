package Interface.Sortable2;

public class QuickSort implements Sortable{
    private int[] array;

    public QuickSort(int[] array){
        this.array = array;
    }

    public void sort(){
        quicksort(0, array.length - 1);        
    }

    public void quicksort(int firstIndex, int lastIndex){
        if(firstIndex >= lastIndex){
            return;
        }

        int pivot = array[lastIndex];

        int endPoint = partition(firstIndex, lastIndex, pivot);

        quicksort(firstIndex, endPoint - 1);
        quicksort(endPoint + 1, lastIndex);
    }

    private int partition(int firstIndex, int lastIndex, int pivot) {
        int leftPointer = firstIndex;
        int rightPointer = lastIndex;

        while(leftPointer < rightPointer){
            while (array[leftPointer] <= pivot && leftPointer < rightPointer) {
                leftPointer++;
            }
            while (array[rightPointer] >= pivot && leftPointer < rightPointer) {
                rightPointer--;
            }
            swap(leftPointer, rightPointer);
        }

        swap(leftPointer, lastIndex);
        return leftPointer;
    }

    public void swap(int leftPointer, int rightPointer){
        int temp = array[leftPointer];
        array[leftPointer] = array[rightPointer];
        array[rightPointer] = temp;
    }

    
}
