package Array;

public class MinInRoatedSortedArray {
    public static void main(String[] args) {

        int[] nums = {4, 5, 6, 7, 1, 2,3};
        int minElement = findMin(nums);

        System.out.println("The minimum element in the rotated sorted array is: " + minElement);

        System.out.println(searchValue(nums));
    }

    private static int findMin(int[] nums) {
        int left =0;
        int right = nums.length -1;

        // When the array is not rotated
        if(nums[left] < nums[right]){
            return nums[left];
        }



        while (left < right){
//            int mid = left + (right - left) / 2;

            int mid = (left + right)/ 2;

            System.out.println( "left : " + left + " right : "+ right);
            System.out.println(mid);

            // Check if mid element is greater than the rightmost element
            if(nums[mid] > nums[right]){
                // The minimum element must be in the right part
                left = mid + 1;
            }else{
                // The minimum element is in the left part (including mid)
                right = mid;
            }
        }

        return nums[left];
    }

    private static int searchValue(int[] arr) {
        for(int i=1; i<arr.length; i++){
           if(arr[i - 1] > arr[i] ){
               System.out.println(arr[i]);
           }
        }
        return -1;
    }
}
