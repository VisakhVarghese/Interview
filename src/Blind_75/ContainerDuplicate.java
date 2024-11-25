package Blind_75;

import java.util.HashSet;
import java.util.Set;

public class ContainerDuplicate {
    public static void main(String[] args) {
        int[] arr = {2,1,3};
        boolean result = containerDuplicate(arr);
        System.out.println(result);
    }

    private static boolean containerDuplicate(int[] arr) {
        Set<Integer> cd = new HashSet<>();
        for(int num : arr){
            if(cd.contains(num)){
                return true;
            }else{
                cd.add(num);
            }

        }
        System.out.println(cd);
        return false;
    }
}
