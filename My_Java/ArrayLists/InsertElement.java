package ArrayLists;

import java.util.ArrayList;

public class InsertElement {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<String>(); 

        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Orange");
        colors.add("Yellow");

        System.out.println("Before: " + colors);
        
        colors.add(0, "Black");
        colors.add(5, "White");

        System.out.println("\n" + "After: " + colors);
        
    }
}
