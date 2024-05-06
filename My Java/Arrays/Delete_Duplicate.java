import java.util.Arrays;
import java.util.Scanner;

public class Delete_Duplicate {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the Array Limit:");
        int limit = scan.nextInt();

        int[] array = new int[limit];

        for(int i = 0; i < limit; i++){
            System.out.print("Element array[" + i + "] = ");
            array[i] = scan.nextInt();
        }

        for(int ar: array){
            System.out.print(ar + " ");
        }

        System.out.println();
        Arrays.sort(array);

        for(int ar: array){
            System.out.print(ar + " ");
        }

        System.out.println();

        int j = 1;

        for(int i = 0; i < array.length - 1; i++){
            if(array[i] != array[i + 1]){
                array[j] = array[i + 1];
                j++;
            }
        }
       
        System.out.println("Removed Duplicates: ");

        for(int a = 0; a < j; a++){
            System.out.print(array[a] + " ");
        }

        scan.close();
    }
}
