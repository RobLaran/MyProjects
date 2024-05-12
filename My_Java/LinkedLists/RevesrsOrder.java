package LinkedLists;

import java.util.Iterator;
import java.util.LinkedList;

public class RevesrsOrder {
    public static void main(String[] args) {
        LinkedList<String> linky = new LinkedList<>();

        linky.add("Red");
        linky.add("Blue");
        linky.add("Green");
        linky.add("Purple");

        System.out.println("Linked Lists: " + linky);

        Iterator<String> it = linky.descendingIterator();

        System.out.println("Descending Order:");
        while(it.hasNext()){
            System.out.println(it.next());
        }

    }
}
