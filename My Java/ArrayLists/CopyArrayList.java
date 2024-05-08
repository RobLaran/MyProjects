package ArrayLists;

import java.util.ArrayList;
import java.util.Collections;

public class CopyArrayList {
    public static void main(String[] args) {
        ArrayList<String> numbers = new ArrayList<String>();
        numbers.add("1");
        numbers.add("2");
        numbers.add("3");
        numbers.add("4");
        
        ArrayList<String> letters = new ArrayList<String>();
        letters.add("A");
        letters.add("B");
        letters.add("C");
        letters.add("D");

        System.out.println("Numbers: " + numbers);
        System.out.println("Letters: " + letters);

        System.out.println("Copy numbers to letters:" + "\n" + "After copy:");

        // Copying the number elements to letter elements.
        Collections.copy(letters, numbers);
        
        System.out.println("Numbers: " + numbers);
        System.out.println("Letters: " + letters);
    }

}
