/*Write a Java Program for Shortening a string to a specified length and adds an ellipsis using user
defined function truncate()*/
package string;

public class TruncateString {
    public static String truncate(String str, int maxLength) {
        if (str.length() <= maxLength) return str;
        return str.substring(0, maxLength - 3) + "...";
    }

    public static void main(String[] args) {
        String input = "This is a long sentence that needs to be shortened.";
        System.out.println("Truncated: " + truncate(input, 25));
    }
}

