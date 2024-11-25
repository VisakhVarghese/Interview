package MinHeap;

import java.util.PriorityQueue;

public class KthLargestEelementInArray {
    public static void main(String[] args) {
        KthLargestEelementInArray solution = new KthLargestEelementInArray();
        int[] nums = {5,3, 2, 1, 6, 4};
        int k = 4;
        System.out.println("The " + k + "th largest element is: " + solution.findKthLargest(nums, k));
    }

    private int findKthLargest(int[] nums, int k) {

        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

//        Set<Integer> set = new HashSet<>();


//        for(int i=0; i<nums.length; i++){
//            set.add(nums[i]);
//
//            if(set.size() > k){
//                set.remove()
//            }
//        }

        for(int num : nums){
            System.out.println(num);
            minHeap.add(num);
            System.out.println(minHeap);
            if(minHeap.size() > k){
                minHeap.poll();
            }

        }

        System.out.println(minHeap);

        return minHeap.peek();
    }
}
