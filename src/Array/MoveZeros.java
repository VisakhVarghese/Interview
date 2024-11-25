package Array;

import java.util.Arrays;

public class MoveZeros {
    public static void main(String[] args) {
        int[] arr = {1,2,0,6,0,9,8};

        int[] result = moveZeros(arr);
        System.out.println(Arrays.toString(result));
    }

    private static int[] moveZeros(int[] arr) {

        if(arr.length==0){
            return null;
        }

        int index = 0;

        for(int i=0; i<arr.length; i++){
            if(arr[i] != 0){
              arr[index] = arr[i];
              index++;
            }
        }

        while (index < arr.length){
            arr[index] = 0;
            index++;
        }

        return arr;
    }
}
