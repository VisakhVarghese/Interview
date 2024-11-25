package Blind_75;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class PoeductOfArrayItself {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        int[] result = containerDuplicate(arr);
        System.out.println(Arrays.toString(result));
    }

    private static int[] containerDuplicate(int[] arr) {
        int[] a = new int[arr.length];

        int prefix =1;
        for(int i=0; i<arr.length; i++){
            System.out.print(prefix+" ");
            a[i] = prefix;
            prefix *= arr[i];
        }
        System.out.println();
        int postfix =1;
        for(int i=0; i< arr.length;i++){
            int index = arr.length-i-1;
            System.out.print(postfix+" ");
            a[index] *= postfix;
            postfix *= arr[index];
        }
        System.out.println();
        return a;
    }
}