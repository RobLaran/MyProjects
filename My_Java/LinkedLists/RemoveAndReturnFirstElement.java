package LinkedLists;

import java.util.LinkedList;

public class RemoveAndReturnFirstElement {
    public static void main(String[] args) {
        LinkedList<String> linky = new LinkedList<>();
        
        linky.add("Red");
        linky.add("Blue");
        linky.add("Green");
        linky.add("Purple");

        System.out.println("Linked Lists: " + linky);

        System.out.println("Removed Element: " + linky.pop());

        System.out.println("Linked Lists: " + linky);

    }
}
