package Array;

import java.util.Arrays;

/**
 * 88. Merge Sorted Array
 * Easy
 * Topics
 * Companies
 * Hint
 * You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, and two integers m and n, representing the number of elements in nums1 and nums2 respectively.
 *
 * Merge nums1 and nums2 into a single array sorted in non-decreasing order.
 *
 * The final sorted array should not be returned by the function, but instead be stored inside the array nums1. To accommodate this, nums1 has a length of m + n, where the first m elements denote the elements that should be merged, and the last n elements are set to 0 and should be ignored. nums2 has a length of n.
 *
 *
 *
 * Example 1:
 *
 * Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
 * Output: [1,2,2,3,5,6]
 * Explanation: The arrays we are merging are [1,2,3] and [2,5,6].
 * The result of the merge is [1,2,2,3,5,6] with the underlined elements coming from nums1.
 * Example 2:
 *
 * Input: nums1 = [1], m = 1, nums2 = [], n = 0
 * Output: [1]
 * Explanation: The arrays we are merging are [1] and [].
 * The result of the merge is [1].
 */
public class MergeSortedArray {
    public static void main(String[] args) {
        int[] nums1 = {1, 3, 5, 7};
        int[] nums2 = {2, 4, 6, 8};

        int[] mergedArray = mergeArray(nums1, nums2);

        System.out.println("Merged array: " + Arrays.toString(mergedArray));
    }

    private static int[] mergeArray(int[] nums1, int[] nums2) {
         int m = nums1.length;
         int n = nums2.length;

         int[] mergedArray = new int[m+n];

        int i = 0, j = 0, k = 0;

        // Merge the arrays
        while (i < n && j < m) {
            if (nums1[i] <= nums2[j]) {
                mergedArray[k++] = nums1[i++];
            } else {
                mergedArray[k++] = nums2[j++];
            }
            System.out.println(Arrays.toString(mergedArray));
        }

        while(i < n){
            mergedArray[k++] = nums1[i++];
        }

        while(j < m){
            mergedArray[k++] = nums2[j++];
        }

        return mergedArray;
    }
}
