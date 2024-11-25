package Blind_75; /**
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

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

class TwoSum {
    public static int[] twoSum(int[] nums, int target) {

        List<int[]> result = new ArrayList<>();

        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i =0; i<=nums.length-1; i++){
            int res = target-nums[i];
            System.out.println(res);
            if(map.containsKey(res)){
               result.add(new int[]{map.get(res), i});
            }
            else{

                map.put(nums[i], i);
            }
            System.out.println(map);
        }

        for (int[] pair : result) {
            System.out.println("Pair: (" + pair[0] + ", " + pair[1] + ")");
        }
        return new int[]{-1,-1};
    }

    public static void main(String[] args) {

        int [] nums = {8,9,2,3,5,7,7,7,11,15,6};
        int target = 9;
        int[] sum = twoSum(nums, target);
        System.out.println(Arrays.toString(sum));
    }
}