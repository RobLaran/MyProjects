package ArrayLists;

import java.util.ArrayList;
import java.util.Collections;

public class SwapElements {
    public static void main(String[] args) {
        ArrayList<String> weapons = new ArrayList<String>();
        weapons.add("Sniper");
        weapons.add("M4A1");
        weapons.add("AK-47");
        weapons.add("Deagle");
        weapons.add("Grenade");

        System.out.println("Before swapping the first and third element: " + weapons);

        Collections.swap(weapons, 0, 3);

        System.out.println("After swapping the first and third elements: " + weapons);


    }

}
