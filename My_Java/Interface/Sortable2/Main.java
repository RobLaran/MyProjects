package Interface.Sortable2;

public class Main {
    public static void main(String[] args) {
        int[] array = {5,1,6,2,3,7,4};
        int[] array2 = {6,2,1,5,4,3,7};

        Sortable quick = new QuickSort(array);
        Sortable merge = new MergeSort(array2);

        // QuickSorting
        System.out.print("Unsorted Array: ");
        for(int i : array){
            System.out.print(i + " ");
        } System.out.println();

        quick.sort();
        System.out.print("Quick Sorting Array: ");
        for(int i : array){
            System.out.print(i + " ");
        } System.out.println();

        // Merge Sorting
        System.out.print("Unsorted Array: ");
        for(int i : array2){
            System.out.print(i + " ");
        } System.out.println();
 
        merge.sort();
        System.out.print("Merge Sorting Array: ");
        for(int i : array2){
            System.out.print(i + " ");
        } System.out.println();

    }
}