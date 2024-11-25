package Array;

public class MinCommonValue {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3};

        int[] arr2 = {2,3,4};

        int i=0;
        int j=0;

        while(i < arr1.length && j < arr2.length){

            if(arr1[i] == arr2[j]){
                System.out.println(arr1[i]);
                break;
            }

            if(arr1[i] < arr2[j]){
                i++;
            }

            if(arr2[j] < arr1[i]){
                j++;
            }
        }
    }
}
