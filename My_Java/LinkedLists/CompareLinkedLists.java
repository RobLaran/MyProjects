package LinkedLists;

import java.util.LinkedList;

public class CompareLinkedLists {
    public static void main(String[] args) {
        LinkedList<String> linky1 = new LinkedList<>();
        LinkedList<String> linky2 = new LinkedList<>();

        linky1.add("Red");
        linky1.add("Blue");
        linky1.add("Green");
        linky1.add("Purple");
        System.out.println("First Linked Lists: " + linky1);
        linky2.add("Red");
        linky2.add("Blue");
        linky2.add("Green");
        linky2.add("Purple");
        linky2.add("Yellow");
        linky2.add("Orange");
        System.out.println("Second Linked Lists: " + linky2);

        LinkedList<String> linky3 = new LinkedList<>();

        for(String str : linky2){
            linky3.add((linky1.contains(str)) ? "Yes" : "No");
        }

        System.out.println("Compare First and Second Linked Lists: " + linky3);

    }
}
