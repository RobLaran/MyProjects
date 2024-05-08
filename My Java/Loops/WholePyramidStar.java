package Loops;

public class WholePyramidStar {
    public static void main(String[] args) {
        
        char star = '*';
        int limit  = 10;

        for(int i = 1; i < limit; i++){
            for(int k = limit; k > i; k--){
                System.out.print(" ");
            }
            for(int j = 0; j < i; j++){
                System.out.print(star + " ");
            }
            System.out.println();            
        }

        for(int i = limit; i > 0; i--){
            for(int k = limit; k > i; k--){
                System.out.print(" ");
            }
            for(int j = 0; j < i; j++){
                System.out.print(star + " ");
            }
            System.out.println();            
        }

    }
}
