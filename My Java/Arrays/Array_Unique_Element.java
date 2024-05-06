import java.util.Scanner;

public class Array_Unique_Element {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the Array Limit: ");
        int limit = scan.nextInt();

        int[] array = new int[limit];
        
        for(int i = 0; i < limit; i++){
            System.out.print("Element array[" + i + "] = ");
            array[i] = scan.nextInt();
        }

        System.out.println("Display Array Unique Elements...");
        
        for(int i = 0; i < limit; i++){
            int j;
            for(j = 0; j < i; j++){
                if(array[i] == array[j]){
                    break;
                }
            }
            if(i == j){
                System.out.print(array[i] + " ");
            }
        }

        scan.close();
    }
}
