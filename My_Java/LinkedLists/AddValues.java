package LinkedLists;
// import  LinkedList

import java.util.LinkedList;

// Write a Java program to append the specified element to the end of a linked list.

// create an empty linked list
// use add() method to add values in the linked list
// print the list

/* 
Sample Output:
The linked list: [Red, Green, Black, White, Pink, Yellow] 
*/

public class AddValues {
    public static void main(String[] args) {
        LinkedList<String> linky = new LinkedList<>();

        linky.add("Red");
        linky.add("Green");
        linky.add("Black");
        linky.add("White");
        linky.add("Purple");

        System.out.println("Linked Lists: " + linky);

    }
}
