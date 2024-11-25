package Array;

public class JumpGame {
    public static void main(String[] args) {
        int[] arr = {2,1,1,4};
        int lastIndex = arr.length-1;
        int nextIndex = 0;
        boolean result = false;

        while(nextIndex <= lastIndex){
            int currentValue;
            currentValue = arr[nextIndex];

            if(nextIndex == lastIndex){
                result = true;
                break;
            }
            nextIndex +=currentValue;
        }

        System.out.println(result);
    }
}
