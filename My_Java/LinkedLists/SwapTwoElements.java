package LinkedLists;

import java.util.Collections;
import java.util.LinkedList;

public class SwapTwoElements {
    public static void main(String[] args) {
        LinkedList<String> linky = new LinkedList<>();

        linky.add("Red");
        linky.add("Blue");
        linky.add("Green");
        linky.add("Purple");

        System.out.println("Linked Lists: " + linky);

        Collections.swap(linky, 0, 3);

        System.out.println("Linked Lists: " + linky);

    }
}
