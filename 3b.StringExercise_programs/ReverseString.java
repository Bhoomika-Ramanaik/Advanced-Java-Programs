/*Write a Java Program for Reversing the characters in a string using user defined function
reverseString().*/
package String;

public class ReverseString  {
    public static String reverseString(String input) {
        return new StringBuilder(input).reverse().toString();
    }

    public static void main(String[] args) {
        String original = "OpenAI";
        String reversed = reverseString(original);
        System.out.println("Original: " + original);
        System.out.println("Reversed: " + reversed);
    }
}

