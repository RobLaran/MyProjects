package ArrayLists;

import java.util.ArrayList;

public class PrintElementsUsingIndexes {
    public static void main(String[] args) {

        ArrayList<String> animals = new ArrayList<String>();
        
        animals.add("Dog");
        animals.add("Cat");
        animals.add("Parrot");
        animals.add("Pig");

        System.out.println("Printing the ArrayList with basic method: " + animals);

        System.out.println("Displaying the elements of the ArrayList using the indexes:");;

        for(int i = 0; i < animals.size(); i++){
            System.out.println("Index [" + i + "] = " + animals.get(i));
        }

    }

}
