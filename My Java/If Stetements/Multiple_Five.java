import java.util.Scanner;

public class Multiple_Five {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num = 1;

        while(num != 0){
            System.out.println("Enter number: ");
            num = scan.nextInt();

            if(num % 5 == 0){
                System.out.println(num + " is multiple of 5!");
            }else{
                System.out.println(num + " is not multiple of 5!");
            }
    
        }
        
       scan.close();
    }
}
