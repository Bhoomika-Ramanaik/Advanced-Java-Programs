package string;

public class StringPerformanceTest {
    public static void main(String[] args) {
        int iterations = 10000;

        // Using StringBuffer
        long startTime1 = System.nanoTime();
        StringBuffer sbuff = new StringBuffer();
        for (int i = 0; i < iterations; i++) {
            sbuff.append("AIET");
        }
        long endTime1 = System.nanoTime();
        System.out.println("StringBuffer time (ns): " + (endTime1 - startTime1));

        // Using StringBuilder
        long startTime2 = System.nanoTime();
        StringBuilder sbuilder = new StringBuilder();
        for (int i = 0; i < iterations; i++) {
            sbuilder.append("AIET");
        }
        long endTime2 = System.nanoTime();
        System.out.println("StringBuilder time (ns): " + (endTime2 - startTime2));

        // Justification
        if ((endTime1 - startTime1) > (endTime2 - startTime2)) {
            System.out.println("✅ StringBuilder is faster than StringBuffer (better for single-threaded operations).");
        } else {
            System.out.println("✅ StringBuffer is faster or equally fast (and thread-safe).");
        }
    }
}
