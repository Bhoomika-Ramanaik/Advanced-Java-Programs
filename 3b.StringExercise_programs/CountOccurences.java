/*Write a Java Program for Counting how many times a substring appears in a main string
using user defined function countOccurrences()*/
package String;

public class CountOccurences {
    public static int countOccurrences(String mainStr, String subStr) {
        int count = 0;
        int idx = 0;
        while ((idx = mainStr.indexOf(subStr, idx)) != -1) {
            count++;
            idx += subStr.length();
        }
        return count;
    }

    public static void main(String[] args) {
        String main = "Java is awesome. Java is powerful. Java is everywhere.";
        String sub = "Java";
        System.out.println("Occurrences: " + countOccurrences(main, sub));
    }
}

