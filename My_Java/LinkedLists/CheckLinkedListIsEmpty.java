package LinkedLists;

import java.util.LinkedList;

public class CheckLinkedListIsEmpty {
    public static void main(String[] args) {
        LinkedList<String> linky = new LinkedList<>();
        LinkedList<String> linky2 = new LinkedList<>();

        
        linky.add("Red");
        linky.add("Blue");
        linky.add("Green");
        linky.add("Purple");

        System.out.println("First Linked Lists: " + linky);
        System.out.println("Second Linked Lists: " + linky2);

        
        String check1 = (linky.isEmpty()) ? "It is Empty" : "It is not Empty";
        System.out.print("Check First Linked List is Empty: " + check1 + "\n");
        String check2 = (linky2.isEmpty()) ? "It is Empty" : "It is not Empty";
        System.out.print("Check Seocnd Linked List is Empty: " + check2);

    }
}
