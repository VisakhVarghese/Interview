package Greedy;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class ArrayPartition {
    public static void main(String[] args) {
        int[] nums = {1,4,3,2};

        Arrays.sort(nums);

       for(int i=0; i<nums.length/2; i++){
           int temp = nums[i];
           nums[i] = nums[nums.length-1-i];
           nums[nums.length-1-i] = temp;
       }

        System.out.println(Arrays.toString(nums));

        int sum = 0;

        for(int i=0; i<nums.length; i+=2){
            sum += nums[i];
        }



        System.out.println(sum);
    }
}
