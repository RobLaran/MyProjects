import java.util.Scanner;

public class SumOfPairValues {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] array = {2, 7, 4, -5, 11, 5, 20};

        System.out.print("Array: ");
        for(int i: array){
            System.out.print(i + " ");
        }
        
        System.out.print("\n" + "Enter a value to sum up two pairs in Array: ");
        int value = scan.nextInt();
        
        sumOfPairValues(array, value);

        scan.close();
    }

    private static void sumOfPairValues(int[] array, int theSumOfPairs){
        System.out.println("Pairs of elements and their sum :  ");

        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array.length; j++){
                if(array[i] + array[j] == theSumOfPairs){
                    System.out.println(array[i] + " + " +  array[j] + " = " + theSumOfPairs );
                }
            }

        }
        
    }
}
