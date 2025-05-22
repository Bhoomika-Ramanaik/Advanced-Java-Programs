/*1.a Develop a Java program for adding elements [Apple, Banana, Orange] into a LinkedList to perform the following operations with different functions directed as
follows
1. Adding elements, 2. Adding element at specific index, 3. Adding multiple elements, 4.
Accessing elements,5. Updating elements, 6. Removing elements, 7. Searching elements, 8. List
size, 9. Iterating over list, 10. Using Iterator, 11. Sorting, 12. Sublist, 13. Clearing the list*/
package LinkedList;

import java.util.*;

public class LinkedListOperations {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();

        // 1. Adding elements
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Orange");
        System.out.println("1. Added Elements: " + linkedList);

        // 2. Add element at specific index
        linkedList.add(1, "Grapes");
        System.out.println("2. After adding at index 1: " + linkedList);

        // 3. Add multiple elements
        List<String> moreFruits = Arrays.asList("Mango", "Pineapple");
        linkedList.addAll(moreFruits);
        System.out.println("3. After adding multiple elements: " + linkedList);

        // 4. Accessing elements
        System.out.println("4. Element at index 2: " + linkedList.get(2));

        // 5. Updating elements
        linkedList.set(0, "Kiwi");
        System.out.println("5. After updating index 0: " + linkedList);

        // 6. Removing elements
        linkedList.remove("Orange");
        System.out.println("6. After removing 'Orange': " + linkedList);

        // 7. Searching elements
        System.out.println("7. Contains 'Mango'? " + linkedList.contains("Mango"));

        // 8. List size
        System.out.println("8. Size: " + linkedList.size());

        // 9. Iterating using for-each
        System.out.print("9. For-each iteration: ");
        for (String fruit : linkedList) {
            System.out.print(fruit + " ");
        }
        System.out.println();

        // 10. Using Iterator
        System.out.print("10. Iterator: ");
        Iterator<String> iterator = linkedList.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();

        // 11. Sorting
        Collections.sort(linkedList);
        System.out.println("11. Sorted: " + linkedList);

        // 12. Sublist
        List<String> sublist = linkedList.subList(1, 3);
        System.out.println("12. Sublist (1 to 3): " + sublist);

        // 13. Clearing the list
        linkedList.clear();
        System.out.println("13. After clearing: " + linkedList);
    }
}
