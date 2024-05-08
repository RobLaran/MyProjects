package Loops;

import java.util.Scanner;

public class HCF {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        int visor, vidend, hcf = 0, remainder = 0;

        System.out.println("Enter First Number: ");
        vidend = scan.nextInt();

        System.out.println("Enter Sceond Number: ");
        visor = scan.nextInt();

        do {
            remainder = vidend % visor;

            if (remainder == 0){
                hcf = visor;
            } else {
                vidend = visor;
                visor = remainder;
            }
        } while (remainder != 0);

        System.out.println("HCF: " + hcf);

        scan.close();

    }
    
}
