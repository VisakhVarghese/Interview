package Array;

public class ContainerWithMostWater {
    public static void main(String[] args) {
        int[] height = {1, 5, 4, 3};
        /**int area = 0;
        for(int i=0; i<arr.length; i++){
           for(int j=i+1; j<arr.length; j++){
               area = Math.max(area,Math.min(arr[i],arr[j])*(j-i));
               System.out.println(area);
           }
        }*/

        final int N = height.length;
        int max = 0 , area, i=0, j=N-1;
        while(j>i){
            area = height[i] < height[j] ? height[i] : height[j];
            area = (j - i) * area;
            if(max < area) max = area;
            if(height[i] < height[j]) i++ ;
            else j--;
        }
    }
}
