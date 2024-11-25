package MinHeap;

import java.util.PriorityQueue;

public class KthSmallestElement {
    public static void main(String[] args) {
        int[] nums = {3,6,7,8,1,9,4,2};
        int k = 3;

        PriorityQueue<Integer> sortNums = new PriorityQueue<>();

        for(int num : nums){
            sortNums.add(num);
        }

        int kthSmallest = -1;

        for(int i=0; i<k; i++){
            if(!sortNums.isEmpty()){
                kthSmallest = sortNums.poll();
            }
        }

        System.out.println(kthSmallest);
    }
}
