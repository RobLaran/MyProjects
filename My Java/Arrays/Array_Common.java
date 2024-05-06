import java.util.Arrays;
import java.util.Scanner;

public class Array_Common {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the First Array Limit: ");
        int limit1 = scan.nextInt();

        int[] array1 = new int[limit1];
        
        for(int i = 0; i < limit1; i++){
            System.out.print("Element array1[" + i + "] = ");
            array1[i] = scan.nextInt();
        }

        System.out.print("Enter the Second Array Limit: ");
        int limit2 = scan.nextInt();
        
        int[] array2 = new int[limit2];

        for(int i = 0; i < limit2; i++){
            System.out.print("Element array2[" + i + "] = ");
            array2[i] = scan.nextInt();
        }

        int l = 0;
        int[] array3 = new int[limit1 + limit2];

        for(int i = 0;i < limit1; i++){
            for(int j = 0; j < limit2; j++){
                if(array1[i] == array2[j]){
                    array3[l] = array1[i];
                    l++;
                }
            }
        }

        Arrays.sort(array3);

        int k = 0;

        for(int i = 0; i < array3.length-1; i++){
            if(array3[i] != array3[i + 1]){
                array3[k] = array3[i + 1];
                k++;
            }
        }

        System.out.println();
        System.out.println("Common Number:");

        for(int i = 0; i < k; i++){
            System.out.print(array3[i] + " ");
        }

        scan.close();
    }
}
