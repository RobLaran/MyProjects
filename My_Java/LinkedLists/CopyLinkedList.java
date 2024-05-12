package LinkedLists;

import java.util.Collections;
import java.util.LinkedList;

public class CopyLinkedList {
    public static void main(String[] args) {
        LinkedList<String> list1 = new LinkedList<String>();
        LinkedList<String> list2 = new LinkedList<String>();

        list1.add("Red");
        list1.add("Blue");
        list1.add("Green");
        list1.add("Purple");
        System.out.println("Linked Lists(1): " + list1);

        list2.add("Red Sun");
        list2.add("Blue Beach");
        list2.add("Light Green");
        list2.add("Deep Purple");
        System.out.println("Linked Lists(2): " + list2);
        
        @SuppressWarnings("unchecked")
        LinkedList<String> clone = (LinkedList<String>)list1.clone();

        System.out.println("Cloned Linked List from Linked List(1): " + clone);

        Collections.copy(list1, list2);

        System.out.println("Copied Elements Linked List(1) from Linked List(2): " + list1);

    }
}
