package Search;


import java.util.Arrays;

// binary search applies when the array is sorted
public class BinarySearch {
    public static void main(String[] args) {
        int[] inputs = {2,3,4,10,40};
        Arrays.sort(inputs);
        int n = inputs.length;
        int x = 2;
        int l = 0;
        int e = n -1;
        while( l <= e){
            int mid = (l+e)/2;

            if(inputs[mid] == x){
                System.out.println(l + " " + e);
                System.out.println(mid);
                break;
            }else if(inputs[mid] > x){
                e = mid - 1;
            }else{
                l = mid + 1;
            }
        }
    }
}
