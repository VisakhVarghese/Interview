package Search;

import java.util.Arrays;

public class RecursiveBinarySearch {
    public static void main(String[] args) {

        int[] inputs = {2,3,4,10,40};
        Arrays.sort(inputs);
        int n = inputs.length;
        int x = 2;
        int l = 0;
        int e = n -1;

        int result = bSearch(inputs, l, e, x);

        System.out.println(result);
    }

    private static int bSearch(int[] arr, int l, int e, int x) {

        if(e >= 1){

            int mid = (l+e)/2;

            if(arr[mid] == x){
                return mid;
            } else if ( arr[mid] > x) {
                return bSearch(arr, l, mid -1, x);
            }else{
                return bSearch(arr, mid+1, e, x);
            }

        }

        return -1;
    }
}
