package ArrayLists;

import java.util.ArrayList;
import java.util.List;

public class SubListingElements {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<String>();

        colors.add("red");
        colors.add("blue");
        colors.add("green");
        colors.add("yellow");
        colors.add("orange");


        System.out.println("Before extracting: " + colors);

        List<String> extractElements = colors.subList(0, 3);

        System.out.println("After extracting the 3 elements: " + extractElements);

    }

}
