package RecursiveMethods;


// We define a class "ArrayProductCalculator" that includes a recursive method calculateProduct() to calculate the product of all numbers in an array.

// The calculateProduct() method has two cases:

// Base case: If the left and right indices are equal, we have a single element and return it as the product.
// Recursive case: For any array with more than one element, we divide the array into two halves by finding the middle index. We then recursively calculate the product in each half by calling the method with the appropriate indices. Finally, we return the product of the two calculated products obtained from the recursive calls.
// In the main() method, we demonstrate the calculateProduct() method by calculating the product of all numbers in the array [1, 3, 5, 7] and printing the result.

// Sample Output:

// The product of all numbers in the array is: 105

public class ArrayProductCalculator {
    public static void main(String[] args) {
        int[] array = {
            1,
            3,
            5,
            7
          };
          int product = calculateProduct(array);
          System.out.println("The product of all numbers in the array is: " + product);

    }

    static int calculateProduct(int[] arr){
        return calculateProduct(arr, 0, arr.length - 1);
    }

    static int calculateProduct(int[] arr, int firstIndex, int lastIndex){
        if(firstIndex == lastIndex){
            return arr[firstIndex];
        }

        int midIndex = (firstIndex + lastIndex) / 2;
        int leftIndices = calculateProduct(arr, firstIndex, midIndex);
        int rightIndices = calculateProduct(arr, midIndex + 1, lastIndex);

        return leftIndices* rightIndices;
        
    }

    


}
