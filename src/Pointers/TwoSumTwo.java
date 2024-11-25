package Pointers;

public class TwoSumTwo {
    public static void main(String[] args) {
        TwoSumTwo solution = new TwoSumTwo();
        int[] numbers = {2,3,5,6,7,11,15};
        int target = 13;
        int[] result = solution.twoSum(numbers, target);
        System.out.println("Indices: " + result[0] + ", " + result[1]);
    }

    private int[] twoSum(int[] numbers, int target) {

        int left = 0;
        int right = numbers.length -1;

        while(left < right){
            int sum = numbers[left] + numbers[right];

            if(sum == target){
                return new int[]{left+1, right+1};

                /* To get all possible pairs
               // Move both pointers to find other pairs and skip duplicates
                left++;
                right--;

                while (left < right && numbers[left] == numbers[left - 1]) {
                    left++;
                }

                while (left < right && numbers[right] == numbers[right + 1]) {
                    right--;
                }
                 */
            }else if(sum < target){ //
                left ++;
            }else{
                right --; //
            }
        }

        throw new IllegalArgumentException("No two sum solution");
    }
}
