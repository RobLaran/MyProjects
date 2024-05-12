package ArrayLists;

import java.util.ArrayList;

public class IterateStringColors {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<String>(); 

        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Orange");
        colors.add("Yellow");

        for (String string : colors) {
            System.out.println(string + " ");
        }
    }
}

