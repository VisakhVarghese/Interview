
import java.util.*;

/**
 * The owner of Hacker Mall loves organized items. A row of items is organized if the parity
 * (even or odd) is different for each adjacent stack of items. To organize the row, half of
 * the items.in any stack can be removed. This can happen as many times and on as many stacks as is required.
 * Determine the minimum number of operations needed to organize a row.
 * ALL
 * 2
 * More formally, given an array items[] of integer of length n, the array is organized if for each x less than n-1,
 * items[x] mod 2 != items[x + 1] mod 2. A mod B is the remainder of A divided by B. In one operation,
 * the owner can choose an element and divide it by 2. That is, if one chooses index x then do items[x] = floor( items[x]/2).
 * The goal is to return the minimum number of operations that one needs to perform to organize the array.
 * Example
 * items = [4, 10, 10, 6, 2]
 * The array is not organized since, for example, items[2] mod 2 = items[3] mod 2.
 * One way to organize the array is shown using 1- based indexing.
 * 1. Choose the 2nd index and divide it by 2; the new array is [4, 5, 10, 6, 2].
 * 2. Choose the 4th index and divide it by 2; the new array is [4, 5, 10, 3, 2].
 * [4, 5, 10, 3, 2] is an organized array so return the number of operations, 2.
 */
public class OrganizedShop {

    public static int getMinimumOperations(List<Integer> items) {
        int operations = 0;

        for (int i = 0; i < items.size() - 1; i++) {
            while (i + 1 < items.size() && items.get(i) % 2 == items.get(i + 1) % 2) {
                System.out.println("Current items: " + items);

                // Divide the next item by 2
                items.set(i + 1, items.get(i + 1) / 2);
                operations++;

                System.out.println("After operation: " + items);

                // If the next item becomes zero, stop further divisions
                if (items.get(i + 1) == 1) {
                    break;
                }
            }
        }

        return operations;
    }

    public static void main(String[] args) {
        // Example usage and testing
        List<Integer> items = new ArrayList<>(Arrays.asList(5, 4, 10, 10, 6, 3));
        int minOperations = getMinimumOperations(items);
        System.out.println("Minimum operations: " + minOperations); // Output: 3
    }
}
