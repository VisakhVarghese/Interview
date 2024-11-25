public class MinRotatedSortedArray {

    public static void main(String[] args) {
        int[] arr = {2,3,4,5,6,0,1};
        int result = findMinRoatedValue(arr);
        System.out.println(result);
    }

    private static int findMinRoatedValue(int[] arr) {
        for(int i=1; i<arr.length; i++){
            if(arr[i]<arr[i-1]){
                return arr[i];
            }
        }
        return arr[0];
    }
}
