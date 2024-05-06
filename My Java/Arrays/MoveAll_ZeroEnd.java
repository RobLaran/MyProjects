public class MoveAll_ZeroEnd {
    public static void main(String[] args) {
        int[] array = {1,0,45,34,0,67,2,0,6,67,45,2,0,10};

        moveZeroesEnd(array);

        System.out.print("Array: ");
        for (int i : array) {
            System.out.print(i + " ");
        }

    }

    private static void moveZeroesEnd(int[] array){
        int count = 0;

        for(int i = 0; i < array.length; i++){
            if(array[i] != 0){
                array[count] = array[i];
                count++;
            }
        }

        while(count < array.length){
            array[count] = 0;
            count++;
        }
    }
}
