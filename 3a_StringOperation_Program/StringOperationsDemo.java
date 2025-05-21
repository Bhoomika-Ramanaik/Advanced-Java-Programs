package String;

import java.util.*;

public class StringOperationsDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. String Creation and Basic Operations
        String str1 = "Hello";
        String str2 = new String("World");
        System.out.println("String 1: " + str1);
        System.out.println("String 2: " + str2);

        // 2. Length and Character Access
        System.out.println("Length of String 1: " + str1.length());
        System.out.println("Character at index 1 of String 1: " + str1.charAt(1));

        // 3. String Comparison
        System.out.println("String 1 equals String 2? " + str1.equals(str2));
        System.out.println("String 1 compareTo String 2: " + str1.compareTo(str2));

        // 4. String Searching
        String searchStr = "Hello World";
        System.out.println("Index of 'World' in '" + searchStr + "': " + searchStr.indexOf("World"));
        System.out.println("Contains 'Hello'? " + searchStr.contains("Hello"));

        // 5. Substring Operations
        System.out.println("Substring (0, 5): " + searchStr.substring(0, 5));

        // 6. String Modification
        String modified = searchStr.replace("World", "Java");
        System.out.println("After Replacement: " + modified);

        // 7. Whitespace Handling
        String withSpaces = "   Hello Java   ";
        System.out.println("Original: '" + withSpaces + "'");
        System.out.println("Trimmed: '" + withSpaces.trim() + "'");

        // 8. String Concatenation
        String concatenated = str1.concat(" ").concat(str2);
        System.out.println("Concatenated String: " + concatenated);

        // 9. String Splitting
        String sentence = "Java is powerful and platform independent";
        String[] words = sentence.split(" ");
        System.out.println("Words in sentence:");
        for (String word : words) {
            System.out.println(word);
        }

        // 10. StringBuilder Demo
        StringBuilder sb = new StringBuilder("Java");
        sb.append(" Programming");
        sb.insert(4, " Language");
        sb.replace(0, 4, "Core");
        sb.delete(5, 13);
        System.out.println("StringBuilder result: " + sb.toString());

        // 11. String Formatting
        String name = "Alice";
        int age = 30;
        String formatted = String.format("Name: %s, Age: %d", name, age);
        System.out.println("Formatted String: " + formatted);

        // 12. Email Validation using contains(), startsWith(), endsWith()
        System.out.print("Enter your email for validation: ");
        String email = scanner.nextLine();

        boolean isValid = email.contains("@") &&
                          email.contains(".") &&
                          email.indexOf("@") < email.lastIndexOf(".") &&
                          email.startsWith(email.substring(0, 1).toLowerCase()) &&
                          email.endsWith(".com");

        if (isValid) {
            System.out.println("Valid Email!");
        } else {
            System.out.println("Invalid Email.");
        }

        scanner.close();
    }
}

