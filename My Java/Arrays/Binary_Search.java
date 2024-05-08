package Arrays;

import java.util.Scanner;

public class Binary_Search {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] array = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};

        System.out.print("Array: ");
        for (int i : array) {
            System.out.print(i + " ");
        }

        System.out.print("\n" + "Enter Item to Search: ");
        int item = scan.nextInt();

        int index = binarySearch(array, item);

        if(index != -1){
            System.out.println("Item found at " + index + " index(Start at 0 index)" );
        } else {
            System.out.println("Item not found!");
        }

        scan.close();
    }

    private static int binarySearch(int[] arrayOfNumbers, int numberToFind){
        int firstIndex = 0;
        int lastIndex = arrayOfNumbers.length - 1;

        while(firstIndex <= lastIndex){
            int middleIndex = (firstIndex + lastIndex) / 2;
            int middleNumber = arrayOfNumbers[middleIndex];

            if(numberToFind == middleNumber){
                return middleIndex;
            }

            if(numberToFind < middleNumber){
                lastIndex = middleIndex - 1;
            } else {
                firstIndex = middleIndex + 1;
            }
        }
        return -1;
    }
}
