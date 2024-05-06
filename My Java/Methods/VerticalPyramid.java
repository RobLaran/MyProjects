package Methods;

public class VerticalPyramid {
    public static void main(String[] args) {
        pattern(21);
    }

    static void pattern(int n){
        char symbol = '*';

        for(int row = 1; row <= n; row++){
            if(row <= (n / 2) + 1){
                for(int col = 0; col < row; col++){
                    System.out.print(symbol + " ");
                }
                 System.out.println();
            } else if(row > (n / 2) + 1){
                for(int col = 0; col <= (n - row); col++){
                    System.out.print(symbol + " ");
                }
                System.out.println();
            }
        }
    }
}
