package BinarySearch;

public class FindFirstAndLastPosition {
    public static void main(String[] args) {
        FindFirstAndLastPosition solution = new FindFirstAndLastPosition();

        // Test Case 1
        int[] nums1 = {5, 7, 7, 8,1, 8, 8, 10};
        int target1 = 8;
        int[] result1 = solution.searchRange(nums1, target1);
        System.out.println("Test Case 1: " + java.util.Arrays.toString(result1)); // Expected: [3, 4]

        // Test Case 2
        int[] nums2 = {5, 7, 7, 8, 8, 10};
        int target2 = 6;
        int[] result2 = solution.searchRange(nums2, target2);
        System.out.println("Test Case 2: " + java.util.Arrays.toString(result2)); // Expected: [-1, -1]

        // Test Case 3
        int[] nums3 = {};
        int target3 = 0;
        int[] result3 = solution.searchRange(nums3, target3);
        System.out.println("Test Case 3: " + java.util.Arrays.toString(result3)); // Expected: [-1, -1]
    }

    private int[] searchRange(int[] nums, int target) {

        int[] result = {-1, -1};

        // Find the first occurrence of the target
        result[0] = findFirstOccurrence(nums, target);

        // If first occurrence is found, find the last occurrence
        if(result[0] != -1){
            result[1] = findLastOccurrence(nums, target);
        }

        return result;
    }

    private int findFirstOccurrence(int[] nums, int target) {

        int left =0, right = nums.length -1;

        int findOccurrence = -1;

        while ( left <= right){
             int mid = (left + right) / 2;

             if( nums[mid] == target){
                 findOccurrence = mid;
                 right = mid - 1;
             }else if( nums[mid] < target){
                 left = mid + 1;
             }else{
                 right = mid - 1;
             }
        }

        return findOccurrence;
    }

    private int findLastOccurrence(int[] nums, int target) {

        int left =0, right = nums.length -1;

        int lastOccurrence = -1;

        while ( left <= right){
             int mid = (left+right) / 2;

             if(nums[mid] == target){
                 lastOccurrence = mid;
                 left = mid + 1;
             }else if( nums[mid] < target){
                 left = mid + 1;
             }else{
                 right = mid - 1;
             }
        }

        return lastOccurrence;

    }

}
