package Arrays;

public class StoreArray {
    public static void main(String[] args) {
        
    int[] array = new int[5];
    
    array[0] = 5;
    array[1] = 11;
    array[2] = 22;
    array[3] = 33;
    array[4] = 44;

    System.out.println("Array Size = " + array.length);

    for(int i = 0; i < array.length; i++){
        System.out.println("Element of array[" + i + "] = " + array[i]);
    }

    System.out.println("Display Array Elements");

    for(int i: array){
        System.out.println(i);
    }

    }
}
