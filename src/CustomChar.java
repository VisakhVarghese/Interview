import java.util.ArrayList;
import java.util.List;

public class CustomChar {
    public CustomChar() {
    }

    public static List<Integer> findingIndexOfNeedle(String str) {
        String v = "needle";
        int length = v.length();
        List<Integer> indices = new ArrayList();

        System.out.println(str.indexOf(v));

        // find all the indices of needle
        for(int index = str.indexOf(v); index >= 0; index = str.indexOf(v, index + 1)) {
            indices.add(index);
        }

        // find start and end indices of needle
//        StringBuffer[][] stringBuffers = new StringBuffer[indices.size()][indices.size()];


        return indices;
    }

    public static void main(String[] args) {
        String needle = "Thereisaneedleinthis.Canyoufindtheneedlehere?";
        List<Integer> index = findingIndexOfNeedle(needle);
        System.out.println(index);

        // Find the index of 'w'
        int indexW = needle.indexOf('w');
        System.out.println("The index of 'w': " + indexW);

        // Try to find the index of a substring not in the string
        int indexJava = needle.indexOf("Java");
        System.out.println("The index of 'Java': " + indexJava);

        // Find the index of 'o' starting from position 5
        int index1 = needle.indexOf('o', 5);
        System.out.println("The index of 'o' from position 5: " + index1);

        // Find the index of "Hello" starting from position 10
        int index2 = needle.indexOf("Hello", 10);
        System.out.println("The index of 'Hello' from position 10: " + index2);

        // Extract substring from index 0 to index 5 (exclusive)
        String substring2 = needle.substring(0, 5);
        System.out.println("Substring from index 0 to 5: " + substring2);
    }
}
