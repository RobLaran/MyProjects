package LinkedLists;

import java.util.Iterator;
import java.util.LinkedList;

public class AddElementsFromNewLinkedList {
    public static void main(String[] args) {
        LinkedList<String> linky = new LinkedList<>();

        linky.add("Red");
        linky.add("Blue");
        linky.add("Green");
        linky.add("Purple");

        System.out.println("Linked Lists: " + linky);

        LinkedList<String> new_linky = new LinkedList<>();

        new_linky.add("Dark Purple");
        new_linky.add("Deep Purple");

        System.out.println("New Linked Lists: " + new_linky);


        linky.addAll(1, new_linky);

        Iterator<String> it = linky.iterator();

        System.out.println("After Inserting Element from new Linked List at Index 1:");
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
