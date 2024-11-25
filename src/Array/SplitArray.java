package Array;

import java.util.HashMap;
import java.util.Map;

public class SplitArray {
    public static void main(String[] args) {
        int[] arr = {1,1,2,2,2,3,4};

        Map<Integer,Integer> a = new HashMap<>();

        boolean r = true;

        for(int value : arr){
            a.put(value, a.getOrDefault(value,0)+1);
        }

        System.out.println(a);

        for (Map.Entry<Integer, Integer> entry : a.entrySet()){
            if(entry.getValue() > 2){
                r = false;
                break;
            }
        }

        System.out.println(r);
    }
}
