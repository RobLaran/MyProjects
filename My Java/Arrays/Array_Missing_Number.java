import java.util.Scanner;

public class Array_Missing_Number {
    public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);

        System.out.print("Enter the Array Limit: ");
        int limit = scan.nextInt();

        int[] array = new int[limit];

        for(int i = 0; i < limit; i++){
            System.out.print("Element array[" + i + "] = ");
            array[i] = scan.nextInt(); 
        }
        
        int res = limit * ((limit + 1) / 2);

        int sum = 0;

        for(int a: array){
            sum += a;
        }

        int outcome = res - sum;

        System.out.println("Missing Array Number is "  + outcome);

        scan.close();
    }
}
