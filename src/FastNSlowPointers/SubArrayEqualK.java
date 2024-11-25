package FastNSlowPointers;

import java.awt.image.ImageProducer;
import java.util.HashMap;
import java.util.Map;

/**
 * Subarray Sum Equals K
 * Given an array of integers nums and an integer k, return the total number of subarrays whose sum equals to k.
 * A subarray is a contiguous non-empty sequence of elements within an array.
 */

public class SubArrayEqualK {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3};
        int k = 3;
        int result = zeroSum(arr1, k);

        System.out.println(result);
    }

    private static int zeroSum(int[] arr1,int k) {
        Map<Integer, Integer> sum = new HashMap<>();
        sum.put(0,1);

        int cumulativeSum = 0;
        int count = 0;

        for( int a : arr1){
            cumulativeSum+=a;

            if(sum.containsKey(cumulativeSum-k)){
                count+=sum.get(cumulativeSum-k);
            }

            sum.put(cumulativeSum, sum.getOrDefault(cumulativeSum,0)+1);
        }

        System.out.println(sum);

        return count;
    }
}
