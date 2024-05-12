package LinkedLists;

import java.util.LinkedList;

public class RetrieveFirstAndLastElement {
    public static void main(String[] args) {
        LinkedList<String> linky = new LinkedList<>();
        
        linky.add("Red");
        linky.add("Blue");
        linky.add("Green");
        linky.add("Purple");

        System.out.println("Linked Lists: " + linky);

        System.out.println("Retrieve First Element: " + linky.peekFirst());
        System.out.println("Retrieve Last Element: " + linky.peekLast());


        System.out.println("Linked Lists: " + linky);

    }
}
