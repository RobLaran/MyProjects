package LinkedLists;

import java.util.ArrayList;
import java.util.LinkedList;

public class ConvertLinkedListToArrayList {
    public static void main(String[] args) {
        LinkedList<String> linky = new LinkedList<>();
        
        linky.add("Red");
        linky.add("Blue");
        linky.add("Green");
        linky.add("Purple");
        System.out.println("Linked Lists: " + linky);
        
        ArrayList<String> arrayList = new ArrayList<>(linky);

        System.out.println("Array List: " + arrayList);
        
    }
}
