/**
 * Question
 * Given an integer array nums , return true if any value appears at least twice in the array,
 * and return false if every element is distinct.
 * Example 1:
 * Input: nums = [1,2,3,1]
 * Output: true
 * Example 2:
 * Input: nums = [1,2,3,4]
 * Output: false
 * Example 3:
 * Input: nums = [1,1,1,3,3,4,3,2,4,2]
 * Output: true
 */

import java.util.*;
class ContainDuplicate {
    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
//        Set<Integer> getDupvalues =  new HashSet<>();
        for(int num: nums) {
            if(set.contains(num)) {
//                getDupvalues.add(num);
                return true;
            }
            else{
                set.add(num);
            }
        }
//        System.out.println(getDupvalues);
        return false;
    }

    public static void main(String[] args) {
        int[] nums = {9,9,1,1,1,3,3,4,5,3,2,4,2};
        boolean rt = containsDuplicate(nums);
        System.out.println(rt);

    }
}