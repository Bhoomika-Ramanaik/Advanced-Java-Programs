/*Write a java program for getting different colors through ArrayList interface and extract the
elements 1st and 2nd from the ArrayList object by using SubList()*/
package Search;

import java.util.*;

public class SubListColors {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>(Arrays.asList("Red", "Green", "Blue", "Yellow"));
        System.out.println("Original Colors: " + colors);

        List<String> subColors = colors.subList(0, 2); // index 0 and 1
        System.out.println("Extracted Elements (1st and 2nd): " + subColors);
    }
}

