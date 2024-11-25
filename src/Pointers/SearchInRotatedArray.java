package Pointers;

public class SearchInRotatedArray {
    public static void main(String[] args) {

        //method 1
        int[] arr = {4,5,6,7,0,1,2};
        int result = searchValue(arr, 0);
        System.out.println("index "+result);

        //method 2
        int[] nums = {4, 5, 6, 7, 0, 1, 2};
        int target = 0;
        int results = searchArray(nums, target);

        if (result != -1) {
            System.out.println("Target " + target + " found at index " + results);
        } else {
            System.out.println("Target " + target + " not found in the array.");
        }
    }

    private static int searchArray(int[] nums, int target) {
        int left =0;
        int right = nums.length -1;

        while (left <= right){
            int mid = left + (right - left) / 2;

            System.out.println(mid);

            if(nums[mid] == target){
                return mid;
            }

            // Determine which side is properly sorted
            if(nums[left] <= nums[mid]){ // Left side is sorted
                if(nums[left] <= target && target < nums[mid]){
                    right = mid - 1; // Target is in the left side
                }else{
                    left = mid + 1; // Target is in the right side
                }
            }else{ // Right side is sorted
                if(nums[left] < target && target <= nums[right]){
                    right = mid + 1; // Target is in the right side
                }else{
                    left = mid - 1; // Target is in the left side
                }
            }
        }

        return -1;
    }

    private static int searchValue(int[] arr, int target) {
            for(int i=0; i<arr.length; i++){
                if(arr[i]==target){
                    return i;
                }
            }
            return -1;
    }
}
