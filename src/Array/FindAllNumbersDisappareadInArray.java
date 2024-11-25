package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 448. Find All Numbers Disappeared in an Array
 * Easy
 * Topics
 * Companies
 * Hint
 * Given an array nums of n integers where nums[i] is in the range [1, n], return an array of all the integers in the range [1, n] that do not appear in nums.
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [4,3,2,7,8,2,3,1]
 * Output: [5,6]
 * Example 2:
 *
 * Input: nums = [1,1]
 * Output: [2]
 */
public class FindAllNumbersDisappareadInArray {
    public static void main(String[] args) {
        int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};
        List<Integer> disappearedNumbers = findDisappearedNumbers(nums);
        System.out.println("Disappeared numbers: " + disappearedNumbers);
    }

    private static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> result = new ArrayList<>();

        for(int i=0; i<nums.length; i++){
            int index = Math.abs(nums[i]) - 1;
            System.out.println(index);
            if(nums[index] > 0){
                nums[index] = -nums[index];
            }
            System.out.println(Arrays.toString(nums));

        }


        for(int i=0; i < nums.length; i++){
            if(nums[i] > 0){
                result.add(i+1);
            }
        }


        return result;
    }
}
