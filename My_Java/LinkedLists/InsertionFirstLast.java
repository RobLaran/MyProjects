package LinkedLists;

import java.util.Iterator;
import java.util.LinkedList;

public class InsertionFirstLast {
    public static void main(String[] args) {
        LinkedList<String> linky = new LinkedList<>();

        linky.add("Red");
        linky.add("Blue");
        linky.add("Green");
        linky.add("Purple");

        System.out.println("Linked Lists: " + linky);

        linky.addFirst("Black");
        linky.addLast("White");

        Iterator<String> it = linky.iterator();

        System.out.println("After Inserting First and Last Element:");
        while(it.hasNext()){
            System.out.println(it.next());
        }

    }
}
