package ArrayList;
import java.util.*;

public class ArrayListOperations {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();

        // 1. Adding elements
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Orange");
        System.out.println("1. Added Elements: " + arrayList);

        // 2. Add element at specific index
        arrayList.add(1, "Grapes");
        System.out.println("2. After adding at index 1: " + arrayList);

        // 3. Add multiple elements
        List<String> moreFruits = Arrays.asList("Mango", "Pineapple");
        arrayList.addAll(moreFruits);
        System.out.println("3. After adding multiple elements: " + arrayList);

        // 4. Accessing elements
        System.out.println("4. Element at index 2: " + arrayList.get(2));

        // 5. Updating elements
        arrayList.set(0, "Kiwi");
        System.out.println("5. After updating index 0: " + arrayList);

        // 6. Removing elements
        arrayList.remove("Orange");
        System.out.println("6. After removing 'Orange': " + arrayList);

        // 7. Searching elements
        System.out.println("7. Contains 'Mango'? " + arrayList.contains("Mango"));

        // 8. List size
        System.out.println("8. Size: " + arrayList.size());

        // 9. Iterating using for-each
        System.out.print("9. For-each iteration: ");
        for (String fruit : arrayList) {
            System.out.print(fruit + " ");
        }
        System.out.println();

        // 10. Using Iterator
        System.out.print("10. Iterator: ");
        Iterator<String> iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();

        // 11. Sorting
        Collections.sort(arrayList);
        System.out.println("11. Sorted: " + arrayList);

        // 12. Sublist
        List<String> sublist = arrayList.subList(1, 3);
        System.out.println("12. Sublist (1 to 3): " + sublist);

        // 13. Clearing the list
        arrayList.clear();
        System.out.println("13. After clearing: " + arrayList);
    }
}
