package LinkedLists;

import java.util.LinkedList;

public class RemoveSpecifiedElement {
    public static void main(String[] args) {
        LinkedList<String> linky = new LinkedList<>();

        linky.add("Red");
        linky.add("Blue");
        linky.add("Green");
        linky.add("Purple");

        System.out.println("Linked Lists: " + linky);

        linky.remove(2);

        System.out.println("Linked Lists: " + linky);

    }
}
