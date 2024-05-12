package ArrayLists;

import java.util.ArrayList;

public class UpdateArrayElement {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<String>(); 

        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Orange");
        colors.add("Yellow");

        System.out.println(colors);

        colors.set(3, "Khaki");
        colors.set(2, "Pink");

        System.out.println("Updated new elements:" + colors);
    }
}
