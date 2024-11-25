package Array;

public class PrimeNumber {
    public static void main(String[] args) {
        int[] nums = {29, 15, 2, 77, 19, 25, 31};

        for(int i=0; i<nums.length; i++){
            if(checkPrime(nums[i])){
                System.out.println(nums[i]);
            }
        }
    }

    private static boolean checkPrime(int num) {
        if(num < 2) return false;

        for(int i = 2; i <= Math.sqrt(num); i++){
            if(num % i == 0){
                return false;
            }
        }

        return true;
    }
}
