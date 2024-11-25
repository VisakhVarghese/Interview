package Interview_Scenarios;

import java.util.ArrayList;
import java.util.List;

/**
 * Thrown when a thread tries to modify a collection (like ArrayList, HashMap, etc.)
 * while another thread is iterating over it.
 */
public class CuncurrentModificationException {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");

        for (String s : list) {
            if (s.equals("A")) {
                list.remove(s); // This will throw ConcurrentModificationException
            }
        }
    }
}
