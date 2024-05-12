package Interface.Sortable;

public class SelectionSort implements Sortable{
    private int[] array;

    public SelectionSort(int[] array){
        this.array = array;
    }

    public void sort(){
        for(int current = 0; current < array.length; current++){
            int minValue = array[current];
            int minValueIndex = current;

            for(int nextIndex = current + 1; nextIndex < array.length; nextIndex++){
                if(array[nextIndex] < minValue){
                    minValue = array[nextIndex];
                    minValueIndex = nextIndex;
                }
            }
            swap(array, current, minValueIndex);
        }
    }

    public void swap(int[] array,int currentIndex,int minValueIndex){
        int temp = array[currentIndex];
        array[currentIndex] = array[minValueIndex];
        array[minValueIndex] = temp;
    }

}
