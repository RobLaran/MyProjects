import java.util.Scanner;

public class Array_AddTwoMatrix {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[][] array1 = new int[100][100];
        int[][] array2 = new int[100][100];

        int rows = 0;
        int columns = 0;

        System.out.print("Input number of rows of matrix: ");
        rows = scan.nextInt();
        System.out.print("Input number of columns of matrix: ");
        columns = scan.nextInt();

        System.out.println("Input elements of first matrix: ");
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < columns; j++){
                array1[i][j] = scan.nextInt();
            }
        }

        System.out.println("Input elements of second matrix: ");
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < columns; j++){
                array2[i][j] = scan.nextInt();
            }
        }

        System.out.println("Sum of the matrices: ");
        int sum;

        for(int i = 0; i < rows; i++){
            for(int j = 0; j < columns; j++){
                sum = array1[i][j] + array2[i][j];
                System.out.print(sum + "\t");
            }
            System.out.println();
        }

        scan.close();
    }
}
