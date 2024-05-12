package LinkedLists;

import java.util.Iterator;
import java.util.LinkedList;

// Write a Java program to iterate through all elements in a linked list starting at the specified position.

// create an empty linked list
// use add() method to add values in the linked list
// set Iterator using listIterator() method at specified index 1
// print list from second position using the hasNext() and next() methods

/* 
Sample Output:

Green                                                                  
Black                                                                  
White                                                                  
Pink 
*/

public class ListIterator {
    public static void main(String[] args) {
        LinkedList<String> linky = new LinkedList<>();

        linky.add("Red");
        linky.add("Blue");
        linky.add("Green");
        linky.add("Purple");

        System.out.println("Linked Lists: " + linky);

        Iterator<String> it = linky.listIterator(1);

        System.out.println("Iterated at index 2:");
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
