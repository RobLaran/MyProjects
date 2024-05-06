public class FindNumber_PrimeNumber {
    public static void main(String[] args) {
        int[] array = {3, 12, 21, 11, 71, 96, 19, 41, 83, 101};

        boolean flag;

        for(int i = 0; i < array.length; i++){
            flag = true;
            for(int j = 2; j < array[i]; j++){
                if(array[i] % j == 0){
                    flag = false;
                    break;
                }
            }
            if(flag == true){
                System.out.println(array[i] + " is a prime a number.");
            } else {
                System.out.println(array[i] + " is not a prime number.");
            }
        }
    }
}
