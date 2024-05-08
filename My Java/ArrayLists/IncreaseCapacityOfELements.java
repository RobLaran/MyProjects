package ArrayLists;

import java.util.ArrayList;

public class IncreaseCapacityOfELements {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<String>(1);
        words.add("Hi");
        words.add("Hello");
        words.add("Whoa");
       
        System.out.println("Original array list:" + words + ", " + words.size() + " elements");

        words.ensureCapacity(9);

        words.add("Hip");
        words.add("Toe");
        words.add("Apple");
        words.add("Ball");
        words.add("Leaf");

        System.out.println("Increased Capacity of the elements:" + words + ", " + words.size() + " elements");


    }

}
