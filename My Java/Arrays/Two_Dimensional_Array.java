package Arrays;

import java.util.Scanner;

public class Two_Dimensional_Array {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int rows, columns, i, j;

        int[][] array2D = new int[100][100];

        System.out.print("Enter the number of rows: ");
        rows = scan.nextInt();
        System.out.print("Enter the number of columns: ");
        columns = scan.nextInt();

        for(i = 0; i < rows; i++){
            for(j = 0; j < columns; j++){
                System.out.print("Enter the Elements of 2D Array: array[" + i + "][" + j + "] = ");
                array2D[i][j] = scan.nextInt();
            }
        }

        System.out.println("Display the 2D Array Elements:");

        for(i = 0; i < rows; i++){
            for(j = 0; j < columns; j++){
                System.out.print(array2D[i][j] + " ");
            }
            System.out.println();
        }

        scan.close();
    }
}
