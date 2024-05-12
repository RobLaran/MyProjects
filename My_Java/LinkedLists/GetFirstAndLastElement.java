package LinkedLists;

import java.util.LinkedList;

public class GetFirstAndLastElement {
    public static void main(String[] args) {
        LinkedList<String> linky = new LinkedList<>();

        linky.add("Red");
        linky.add("Blue");
        linky.add("Green");
        linky.add("Purple");

        System.out.println("Linked Lists: " + linky);

        System.out.println("First element: " + linky.getFirst() + "\nLast Element: " + linky.getLast());

        for(int i = 0; i < linky.size(); i++){
            System.out.println(linky.get(i) + " at index " + i);
        }        
        

    }
}
