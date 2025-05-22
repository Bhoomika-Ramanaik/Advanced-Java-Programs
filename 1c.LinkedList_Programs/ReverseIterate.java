/*Write a Java program to iterate a linked list in reverse order (using
objlist.descendingIterator())*/
package Linkedlist;

import java.util.*;

public class ReverseIterate {
    public static void main(String[] args) {
        LinkedList<String> colors = new LinkedList<>(Arrays.asList("Red", "Green", "Blue", "Yellow", "Pink"));

        System.out.println("Original LinkedList: " + colors);

        Iterator<String> descIterator = colors.descendingIterator();
        System.out.println("Iterating in reverse order:");
        while (descIterator.hasNext()) {
            System.out.println(descIterator.next());
        }
    }
}
