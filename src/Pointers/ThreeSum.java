package Pointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public static void main(String[] args) {
        ThreeSum solution = new ThreeSum();
        int[] nums = {-1, 0, 1, 2, -1, -4};
        List<List<Integer>> result = solution.threeSum(nums);
        for (List<Integer> triplet : result) {
            System.out.println(triplet);
        }
    }

    private List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        for(int i=0; i<nums.length -2; i++){
            if(i>0 && nums[i] == nums[i-1]){  // Skip duplicates
                continue;
            }
            int left = i + 1;
            int right = nums.length -2; //we need at least three numbers to form a triplet

            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
//                System.out.println("num 1 : "+i+" num left : "+left+" num right : "+right);
                System.out.println("num 1 : "+nums[i]+" num left : "+nums[left]+" num right : "+nums[right]);
                if(sum == 0){
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    while(left < right && nums[left] == nums[left+1]){
                        left++;
                    }
                    while(left < right && nums[right] == nums[right-1]){
                        right--;
                    }
                    left++;
                    right--;
                }else if(sum<0){
                    left++;
                }else{
                    right--;
                }
            }
        }

        return result;
    }
}
