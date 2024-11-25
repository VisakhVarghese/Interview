package Pointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5,6,7,8};
//        List<Integer> reversedArray = new ArrayList<>();
//        for(int i=0; i<arr.length; i++){
//            reversedArray.add(arr[arr.length-i-1]);
//        }
//
        reverseArray(arr);

        System.out.println(Arrays.toString(arr));

    }

    private static void reverseArray(int[] arr) {

        int left = 0, right = arr.length - 1;

        while(left < right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }
    }

}
