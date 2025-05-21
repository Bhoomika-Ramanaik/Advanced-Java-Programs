package String;

public class RemoveWhiteSpace {
    public static String removeWhitespace(String str) {
        return str.replaceAll("\\s+", "");
    }

    public static void main(String[] args) {
        String input = "  Java   Programming  Language ";
        String noWhitespace = removeWhitespace(input);
        System.out.println("Original: '" + input + "'");
        System.out.println("No whitespace: '" + noWhitespace + "'");
    }
}

