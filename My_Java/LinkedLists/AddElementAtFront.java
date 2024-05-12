package LinkedLists;

import java.util.Iterator;
import java.util.LinkedList;

public class AddElementAtFront {
    public static void main(String[] args) {
        LinkedList<String> linky = new LinkedList<>();

        linky.add("Red");
        linky.add("Blue");
        linky.add("Green");
        linky.add("Purple");

        System.out.println("Linked Lists: " + linky);

        linky.offerFirst("White");

        Iterator<String> it = linky.iterator();

        System.out.println("After Inserting Element at front:");
        while(it.hasNext()){
            System.out.println(it.next());
        }

    }
}
