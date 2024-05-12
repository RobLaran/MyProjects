package LinkedLists;

import java.util.LinkedList;

public class CombineTwoLinkedLists {
    public static void main(String[] args) {
        LinkedList<String> list1 = new LinkedList<>();
        LinkedList<String> list2 = new LinkedList<>();

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

        LinkedList<String> list3 = new LinkedList<>();

        list3.addAll(list1);
        list3.addAll(list2);

        System.out.println("Combined Linked Lists's Elements: " + list3);

    }
}
