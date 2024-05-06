public class TestLoops{
    public static void main(String[] args) {
        int[] array = {2, 65, 23, 13, 18, 30, 46, 17, 52, 78};

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
            int min = array[i];
            int indexOfMin = i;
            for(int j = i + 1; j < array.length; j++){
                if(array[j] < min){
                    min = array[j];
                    indexOfMin = j;
                }
            }
            swap(array, i, indexOfMin);
        }
    }

    private static void swap(int[] array, int x, int y) {
        int temp = array[x];
        array[x] = array[y];
        array[y] = temp;
    }
}
