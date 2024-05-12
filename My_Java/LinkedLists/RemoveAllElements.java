package LinkedLists;

import java.util.LinkedList;

public class RemoveAllElements {
    public static void main(String[] args) {
        LinkedList<String> linky = new LinkedList<>();

        linky.add("Red");
        linky.add("Blue");
        linky.add("Green");
        linky.add("Purple");

        System.out.println("Linked Lists: " + linky);

        linky.removeAll(linky);

        System.out.println("Linked Lists: " + linky);

    }
}
