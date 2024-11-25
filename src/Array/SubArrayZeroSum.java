package Array;

public class SubArrayZeroSum {
    public static void main(String[] args) {
        int[] arr1 = {4,2,-3,1,6};

        boolean result = zeroSum(arr1);

        System.out.println(result);
    }

    private static boolean zeroSum(int[] arr1) {

        for(int i=0; i<arr1.length;i++){
            System.out.println(arr1[i]);
            int sum = 0;

            for(int j=i; j<arr1.length; j++){
                System.out.println(arr1[j]);
                sum+= arr1[j];
                System.out.println(sum);
                if(sum == 0)
                    return true;
            }
        }


        return false;
    }
}
