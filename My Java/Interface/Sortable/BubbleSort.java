package Interface.Sortable;

public class BubbleSort implements Sortable{
    private int[] array;

    public BubbleSort(int[] array){
        this.array = array;
    }

    @Override
    public void sort(){
        boolean flag = true;

        while(flag){
            flag = false;

            for(int i = 0; i < array.length; i++){
                if(i == array.length - 1){
                    break;
                }else if(array[i] > array[i + 1]){
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    flag = true;
                }
                
            }
        }
    }

}
