package DP; /**
 * Question
 * Given an integer array nums, find the subarray with the largest sum, and return its sum
 * Example 1:
 * Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
 * Output: 6
 * Explanation: The subarray [4,-1,2,1] has the largest sum 6.
 * Example 2:
 * Input: nums = [1]
 * Output: 1
 * Explanation: The subarray [1] has the largest sum 1.
 * Example 3:
 * Input: nums = [5,4,-1,7,8]
 * Output: 23
 * Explanation: The subarray [5,4,-1,7,8] has the largest sum 23.
 */

import java.util.Arrays;

class MaximumSubarray {
    public static int maxSubArray(int[] nums) {
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        int max = nums[0];
        for(int i = 1; i<nums.length; i++) {
            System.out.println(nums[i]+" "+dp[i-1]+" "+nums[i]);
            dp[i] = Math.max(nums[i], dp[i-1]+nums[i]);
            max = dp[i] > max? dp[i]: max;
            System.out.println(max);
        }
        System.out.println(Arrays.toString(dp));
        return max;
    }

    public static void main(String[] args) {
        int[] nums = {2,3,-2,4};
        int max = maxSubArray(nums);
        System.out.println(max);
    }
}