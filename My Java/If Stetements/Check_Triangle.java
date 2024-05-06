import java.util.Scanner;

public class Check_Triangle {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        int side1, side2, side3;

        System.out.println("Enter three angles:");
        side1 = scan.nextInt();
        side2 = scan.nextInt();
        side3 = scan.nextInt();

        if(side1 == side2 && side2 == side3){
            System.out.println("Equilateral Triangle");
        } else if(side1 == side2 || side1 == side3 || side2 == side3){
            System.out.println("Isosceles Triangle");
        } else {
            System.out.println("Scalene Triangle");
        }

        scan.close();
    }
}
