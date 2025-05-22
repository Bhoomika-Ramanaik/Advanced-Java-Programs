/*1. Write a java program for getting different colors through ArrayList interface and search whether
the color "Red" is available or not*/
package Search;

import java.util.*;

public class SearchColor {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>(Arrays.asList("Red", "Green", "Blue", "Yellow"));
        System.out.println("Colors: " + colors);

        if (colors.contains("Red")) {
            System.out.println("\"Red\" is available in the list.");
        } else {
            System.out.println("\"Red\" is NOT available in the list.");
        }
    }
}

