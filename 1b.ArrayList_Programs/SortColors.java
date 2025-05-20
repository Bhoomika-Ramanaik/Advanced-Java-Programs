package Search;

import java.util.*;

public class SortColors {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>(Arrays.asList("Yellow", "Red", "Blue", "Green"));
        System.out.println("Before Sorting: " + colors);

        Collections.sort(colors);
        System.out.println("After Sorting: " + colors);
    }
}

