package Interface.Sortable;

// Sample Output:
// Unsorted Array: 1 3 2 6 4 8 0
// Bubble Sort: 0 1 2 3 4 6 8
// Selection Sort: 0 1 2 3 4 6 8 

// Explanation:
// The "BubbleSort" class and "SelectionSort" class both implement the Sortable interface and provide their own implementations of the sort() method. The "BubbleSort" class uses the bubble sort algorithm, and the SelectionSort class uses the selection sort algorithm.

// In the main() method, we create an array of integers and then create instances of the BubbleSort and SelectionSort classes. We call the sort() method on each instance, pass in the array, and then print the sorted array using the printArray() method.

public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 6, 2 ,3, 4, 8, 0};
        int[] arra = {52, 60, 22 ,33, 44, 81, 70};

        Sortable bubSort = new BubbleSort(arr);
        Sortable selSort = new SelectionSort(arra);

        // Bubble Sorting Array
        System.out.print("Unsorted Array: ");
        for(int i : arr){
            System.out.print(i + " ");
        }System.out.println();
        
        bubSort.sort();
        System.out.print("Bubble Sort Array: ");
        for(int i : arr){
            System.out.print(i + " ");
        }System.out.println();

        // Selection Sorting Array
        System.out.print("Unsorted Array: ");
        for(int i : arra){
            System.out.print(i + " ");
        }System.out.println();
        
        selSort.sort();
        System.out.print("Selection Sort Array: ");
        for(int i : arra){
            System.out.print(i + " ");
        }System.out.println();
    }
}
