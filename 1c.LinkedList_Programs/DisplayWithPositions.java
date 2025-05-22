/*Write a Java program to display elements and their positions in a linked list ( using
l_listobj.get(p) )*/
package Linkedlist;

import java.util.*;

public class DisplayWithPositions {
    public static void main(String[] args) {
        LinkedList<String> colors = new LinkedList<>(Arrays.asList("Red", "Green", "Blue", "Yellow"));

        System.out.println("LinkedList Elements and Their Positions:");
        for (int i = 0; i < colors.size(); i++) {
            System.out.println("Position " + i + ": " + colors.get(i));
        }
    }
}
