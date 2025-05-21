package string;

public class CapitalzeWords {
    public static String capitalizeWords(String str) {
        String[] words = str.trim().split("\\s+");
        StringBuilder result = new StringBuilder();
        for (String word : words) {
            if (!word.isEmpty()) {
                result.append(Character.toUpperCase(word.charAt(0)))
                      .append(word.substring(1).toLowerCase()).append(" ");
            }
        }
        return result.toString().trim();
    }

    public static void main(String[] args) {
        String input = "java programming is fun";
        System.out.println("Capitalized: " + capitalizeWords(input));
    }
}

