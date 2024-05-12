package LinkedLists;

import java.util.LinkedList;

// Write a Java program to iterate through all elements in a linked list.

// create an empty linked list
// use add() method to add values in the linked list
// Print the linked list in loop

/* 
Sample Output:

Red                                                                    
Green                                                                  
Black                                                                  
White                                                                  
Pink 
 */

public class IterateAllElements {
    public static void main(String[] args) {
        LinkedList<String> linky = new LinkedList<>();

        linky.add("Red");
        linky.add("Blue");
        linky.add("Green");
        linky.add("Purple");

        for(String str : linky){
            System.out.println(str);
        }

    }
}
