package Array;

import java.util.HashSet;
import java.util.Set;

public class IntersectionOfArray {
    public static void main(String[] args) {
        int[] arr1 = {1,2,2,1};
        int[] arr2 = {2,2};

        Set<Integer> result = intersectionOfTwoArray(arr1, arr2);
        System.out.println(result);
    }

    private static Set<Integer> intersectionOfTwoArray(int[] arr1, int[] arr2) {

        Set<Integer> values = new HashSet<>();
        Set<Integer> r = new HashSet<>();

        for(int i=0; i<arr1.length; i++){
            values.add(arr1[i]);
        }

        for(int v : arr2){
            if(values.contains(v)){
                r.add(v);
            }
        }

        System.out.println(values);

        return r;
    }

}


