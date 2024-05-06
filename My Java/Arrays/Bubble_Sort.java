public class Bubble_Sort {
    public static void main(String[] args) {
        int[] array = {2, 65, 23, 13, 18, 30, 46, 17, 52, 78};

        System.out.println("Before Bubble Sorting the Array: ");
        for (int i : array) {
            System.out.print(i + " ");
        }

        boolean swap = true;

        while (swap) {
            swap = false;
            for (int i = array.length - 1; i > 0; i--){
                if (array[i] > array[i - 1]) {
                    swap = true;
                    int temp = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = temp;
                }
            }
        }

        System.out.println("\n" + "After Bubble Sorting the Array: ");
        for (int i : array) {
            System.out.print(i + " ");
        }
    }
}
