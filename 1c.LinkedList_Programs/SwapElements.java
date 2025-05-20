package Linkedlist;

import java.util.*;

public class SwapElements {
    public static void main(String[] args) {
        LinkedList<String> colors = new LinkedList<>(Arrays.asList("Red", "Green", "Blue", "Yellow"));

        System.out.println("Before swap: " + colors);
        Collections.swap(colors, 0, 2); // Swapping first (index 0) and third (index 2)
        System.out.println("After swapping first and third: " + colors);
    }
}

