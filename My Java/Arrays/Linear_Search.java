import java.util.Scanner;

public class Linear_Search {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] array = new int[6];

        for(int  i = 0; i < array.length; i++){
            System.out.print("Enter element of array[" + i + "] = ");
            array[i] = scan.nextInt();
        }

        System.out.print("Enter item to search: ");
        int item = scan.nextInt();

        int index = linearSearch(array, item);

        if(index != -1){
            System.out.println("Item found at index " + index);
        } else {
            System.out.println("Item not found!");
        }

        scan.close();
    }

    private static int linearSearch(int[] array, int itemToSearch) {
        int i = 0;
        int index = -1;

        for(i = 0; i < array.length; i++){
            if(itemToSearch == array[i]){
                index = i;
                break;
            }
        }
        return index;
    }


}
