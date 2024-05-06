import java.util.Scanner;

public class Array_Search_Element {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter the Array Limit: ");
        int limit = scan.nextInt();

        int[] arr = new int[limit];

        for(int i = 0; i < limit; i++){
            System.out.print("Element of a[" + i + "] = ");
            arr[i] = scan.nextInt();
        }

        System.out.print("Enter the Search Array Element : ");
        int search = scan.nextInt();

        boolean flag = false;

        scan.close();

        int j;

        for(j = 0; j < limit; j++){
            if(arr[j] == search){
                flag = true;
                break;
            }
        }

        if (flag == true){
            j++;
            System.out.println("The Element is found in the position : " + j);
            j--;
            System.out.println("The Element is found in the index : " + j);
        } else {
            System.out.println("The Element is Not found");
        }

    }
}
