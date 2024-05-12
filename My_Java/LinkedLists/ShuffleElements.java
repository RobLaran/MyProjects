package LinkedLists;

import java.util.Collections;
import java.util.LinkedList;

public class ShuffleElements {
    public static void main(String[] args) {
        LinkedList<String> linky = new LinkedList<>();

        linky.add("Red");
        linky.add("Blue");
        linky.add("Green");
        linky.add("Purple");

        System.out.println("Linked Lists: " + linky);

        Collections.shuffle(linky);

        System.out.println("Linked Lists: " + linky);

    }
}
