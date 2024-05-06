import java.util.Scanner;

public class All_Side_Triangle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int side1 = 0, side2 = 0, side3 = 0;
        
        System.out.println("Enter Three Sides: ");
        
        side1 = scan.nextInt();
        side2 = scan.nextInt();
        side3 = scan.nextInt();

        if((side1 + side2) > side3){
            System.out.println("Triangle is valid");
            if ((side1 + side3) > side2) {
                System.out.println("Triangle is valid");
                if ((side2 + side3) > side1) {
                    System.out.println("Triangle is valid");
                } else {
                    System.out.println("Triangle is not valid");
                }
            } else {
                System.out.println("Triangle is not valid");
            }
        } else {
            System.out.println("Triangle is not valid");
        }

        

        scan.close();
    }
}
