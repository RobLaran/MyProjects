package Methods;

public class PentagonalNumbers {
    public static void main(String[] args) {

        int pentNum = 1;

        for(int i = 0; i < 5; i++){
            for(int j = 0; j  < 10; j++){
                System.out.print(getPentagonalNumbers(pentNum++) + "\t");
            }
            System.out.println();
        }

    }

    private static int getPentagonalNumbers(int n){

        return (3 * (n * n) - n) / 2;

    }

}
