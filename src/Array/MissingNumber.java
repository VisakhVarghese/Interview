package Array;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {0,1,2,3,4,5,6,7,8,10};

        List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());

        for(int i=0; i<arr.length; i++){
            if(!list.contains(i)){
                System.out.println(i);
            }
        }
    }
}
