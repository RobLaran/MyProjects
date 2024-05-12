package LinkedLists;

import java.util.LinkedList;

public class ReplaceElement {
    public static void main(String[] args) {
        LinkedList<String> linky = new LinkedList<>();
        
        linky.add("Red");
        linky.add("Blue");
        linky.add("Green");
        linky.add("Purple");
        System.out.println("Linked Lists: " + linky);

        linky.set(1, "Neon");

        System.out.println("New Linked List After Replacing Element: " + linky);
        
    }
}
