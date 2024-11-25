package XOR;

import java.io.FilterOutputStream;
import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

public class SingleNumber {
    public static void main(String[] args) {
        int[] arr = {1,2,3,2,3,5,5};

        Map<Integer,Integer> treeMap = new TreeMap<>();

//        Arrays.sort(arr);

        int result = 0;

        for(int num : arr){
            result ^= num;
        }

        System.out.println(result);

//        for (int a : arr){
//            treeMap.put(a,treeMap.getOrDefault(a,0)+1);
//        }
//
//        System.out.println(treeMap);

    }
}
