package Linkedlist;

import java.util.*;

public class IterateFromSecond {
    public static void main(String[] args) {
        LinkedList<String> colors = new LinkedList<>(Arrays.asList("Red", "Green", "Blue", "Yellow", "Pink"));

        System.out.println("Original LinkedList: " + colors);

        Iterator<String> iterator = colors.listIterator(1); // Starting from index 1 (2nd position)
        System.out.println("Iterating from 2nd position:");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}

