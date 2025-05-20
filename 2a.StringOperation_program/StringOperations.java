package String;

public class StringOperations {
    public static void main(String[] args) {
        // String Creation and Basic Operations
        String s1 = "AIET";
        String s2 = new String("Technology");
        System.out.println("Original Strings: s1 = " + s1 + ", s2 = " + s2);

        // Length and Character Access
        System.out.println("Length of s1: " + s1.length());
        System.out.println("Character at index 2 in s1: " + s1.charAt(2));

        // String Comparison
        String s3 = "AIET";
        System.out.println("s1 equals s3? " + s1.equals(s3));
        System.out.println("s1 compareTo s2: " + s1.compareTo(s2));

        // String Searching
        String s4 = "Welcome to AIET College";
        System.out.println("Index of 'AIET' in s4: " + s4.indexOf("AIET"));
        System.out.println("s4 contains 'College'? " + s4.contains("College"));

        // Substring Operations
        System.out.println("Substring of s4 from 11: " + s4.substring(11));
        System.out.println("Substring of s4 from 11 to 15: " + s4.substring(11, 15));

        // String Modification
        String modified = s4.replace("AIET", "XYZ");
        System.out.println("Modified string: " + modified);

        // Whitespace Handling
        String s5 = "   Hello AIET   ";
        System.out.println("Before trim: '" + s5 + "'");
        System.out.println("After trim: '" + s5.trim() + "'");

        // String Concatenation
        String full = s1.concat(" ").concat(s2);
        System.out.println("Concatenated String: " + full);

        // String Splitting
        String[] parts = s4.split(" ");
        System.out.println("Split string:");
        for (String part : parts) {
            System.out.println(part);
        }

        // StringBuilder Demo
        StringBuilder sb = new StringBuilder("AIET");
        sb.append(" College");
        System.out.println("StringBuilder Result: " + sb.toString());

        // String Formatting
        String name = "John";
        int age = 22;
        String formatted = String.format("Name: %s, Age: %d", name, age);
        System.out.println("Formatted String: " + formatted);

        // Email Validation
        String email = "student@aiet.edu";
        if (email.contains("@") && email.startsWith("student") && email.endsWith(".edu")) {
            System.out.println("Valid Email: " + email);
        } else {
            System.out.println("Invalid Email: " + email);
        }
    }
}

