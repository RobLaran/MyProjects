package Interface.Sortable2;

public class MergeSort implements Sortable{
    private int[] array;

    public MergeSort(int[] array){
        this.array = array;
    }

    public void sort(){
        mergeSort(array,0, array.length - 1);
    }

    public void mergeSort(int[] arrayClone ,int firstIndex, int lastIndex){
        if(firstIndex < lastIndex){
            int mid = (firstIndex + lastIndex) / 2;
                
            mergeSort(arrayClone ,firstIndex, mid);  
            mergeSort(arrayClone ,mid + 1, lastIndex);  
                
            merge(arrayClone ,firstIndex, lastIndex, mid);  
        }

    }

    public void merge(int[] arrayClone ,int firstIndex, int lastIndex, int mid){
        int leftArrSize = mid - firstIndex + 1;
        int rightArrSize = lastIndex - mid;

        int[] leftArray = new int[leftArrSize];
        int[] rightArray = new int[rightArrSize];

        for(int i = 0; i < leftArrSize; i++){
            leftArray[i] = arrayClone[firstIndex + i];
        }  

        for(int i = 0; i < rightArrSize; i++){
            rightArray[i] = arrayClone[mid + 1 + i];
        }

        int i = 0;
        int j = 0;
        int k = firstIndex;

        while (i < leftArrSize && j < rightArrSize) {
            if(leftArray[i] <= rightArray[j]){
                arrayClone[k] = leftArray[i];
                i++;
            } else{
                arrayClone[k] = rightArray[j];
                j++;
            }
            k++;
        }

        while(i < leftArrSize){
            arrayClone[k] = leftArray[i];
            i++;
            k++;
        }

        while(j < rightArrSize){
            arrayClone[k] = rightArray[j];
            j++;
            k++;
        }
    }
}
