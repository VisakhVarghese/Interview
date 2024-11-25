package Pointers; /**
 * Question
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 * You can return the answer in any order.
 * Example 1:
 * Input: nums = [2,7,11,15], target = 9
 * Output: [0,1]
 * Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
 * Example 2:
 * Input: nums = [3,2,4], target = 6
 * Output: [1,2]
 * Example 3:
 * Input: nums = [3,3], target = 6
 * Output: [0,1]
 */

import java.util.*;
class TwoSum {
    public static int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> map = new HashMap<>();
        for(int i =0; i<=nums.length-1; i++){
            int res = target-nums[i];
            System.out.println(res);
            if(map.containsKey(res)){
                return new int[]{map.get(res), i};
            }
            else{
                map.put(nums[i], i);
            }
            System.out.println(map);
        }
        return new int[]{-1,-1};
    }

    public static void main(String[] args) {

        int [] nums = {2,7,11,15};
        int target = 9;
        int[] sum = twoSum(nums, target);
        System.out.println(Arrays.toString(sum));
    }
}