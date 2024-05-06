import java.util.Arrays;
import java.util.Scanner;

public class EvenOddNum_ThirdArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the First Array Limit: ");
        int limit1 = scan.nextInt();
        
        int[] array1 = new int[limit1];
        
        System.out.print("Enter the Second Array Limit: ");
        int limit2 = scan.nextInt();
        
        int[] array2 = new int[limit2];
        
        int j = 0;
        int l = 0;
        int[] arrayEven = new int[limit1 + limit2];
        int[] arrayOdd = new int[limit1 + limit2];

        System.out.println("First Array:");
         
        for(int i = 0; i < limit1; i++){
            System.out.print("Element array1[" + i + "] = ");
            array1[i] = scan.nextInt();
            if(array1[i] % 2 == 0){
                arrayEven[j] = array1[i];
                j++;
            }
            if(array1[i] % 2 == 1){
                arrayOdd[l] = array1[i];
                l++;
            }
        }

        System.out.println("Second Array:");

        for(int k = 0; k < limit2; k++){
            System.out.print("Element array2[" + k + "] = ");
            array2[k] = scan.nextInt();
            if(array2[k] % 2 == 0){
                arrayEven[j] = array2[k];
                j++;
            }
            if(array2[k] % 2 == 1){
                arrayOdd[l] = array2[k];
                l++;
            }
        }

        System.out.println();

        Arrays.sort(arrayEven);
        Arrays.sort(arrayOdd);

        System.out.println();

        int k = 0;
        for(int i = 0; i < arrayEven.length - 1; i++){
            if(arrayEven[i] != arrayEven[i + 1]){
                arrayEven[k] = arrayEven[i + 1];
                k++;
            }
        }

        int o = 0;
        for(int i = 0; i < arrayOdd.length - 1; i++){
            if(arrayOdd[i] != arrayOdd[i + 1]){
                arrayOdd[o] = arrayOdd[i + 1];
                o++;
            }
        }

        System.out.println("Even Array only even elements from First and Second Array:");
        
        for(int i = 0; i < k ; i++){
            System.out.print(arrayEven[i] + " ");
        }

        System.out.println();

        System.out.println("Odd Array only even elements from First and Second Array:");
        
        for(int i = 0; i < o ; i++){
            System.out.print(arrayOdd[i] + " ");
        }


        scan.close();
        
    }
}
