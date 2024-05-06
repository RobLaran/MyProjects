import java.util.Scanner;

public class Array_Second_Smallest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the array limit: ");
        int limit = scan.nextInt();

        int[] array = new int[limit];

        for(int i = 0; i < limit; i++){
            System.out.print("Element array[" + i + "] = ");
            array[i] = scan.nextInt();
        }

        int temp;

        for(int i = 0; i < limit; i++){
            for(int j = i + 1; j < limit; j++){
                if(array[i] > array[j]){
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }

        System.out.println();

        int j = 1;

        for(int i = 0; i < array.length - 1; i++){
            if(array[i] != array[i + 1]){
                array[j] = array[i + 1];
                j++;
            }
        }

        System.out.println("Second smallest number in the array: " + array[1]);

        scan.close();
    }
}
