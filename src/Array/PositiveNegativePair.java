package Array;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Given an array of distinct integers, find all the pairs having positive value and negative value of a number that exists in the array. Return the pairs in any order.
 * Note:
 * The pair consists of equal absolute values, one being positive and another negative.
 *
 * Return an empty array, if no such pair exists.
 */

public class PositiveNegativePair {
    public static void main(String[] args) {
        int[] arr = {1, -1, 2, -2, 3, -3, 4, -5};
        List<int[]> pairs = findPairs(arr);

        for (int[] pair : pairs) {
            System.out.println("Pair: (" + pair[0] + ", " + pair[1] + ")");
        }
    }

    private static List<int[]> findPairs(int[] arr) {
        Set<Integer> set = new HashSet<>();

        List<int[]> result = new ArrayList<>();

        for(int num : arr){
            set.add(num);
        }

        for(int n : arr){
            if(set.contains(-n) && set.contains(n)){
                result.add(new int[]{n, -n});
                set.remove(-n);
                set.remove(n);
            }
        }

        return result;
    }
}
