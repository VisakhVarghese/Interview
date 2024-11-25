package BinarySearch;

public class SearchTwoDArray {
    public static void main(String[] args) {
        SearchTwoDArray search = new SearchTwoDArray();

        int[][] matrix = {
                {1, 3, 5, 7},
                {10, 11, 16, 20},
                {23, 30, 34, 60}
        };

        int target1 = 3;
        int target2 = 13;

        System.out.println(search.searchMatrix(matrix, target1)); // true
        System.out.println(search.searchMatrix(matrix, target2));
    }

    private boolean searchMatrix(int[][] matrix, int target) {

        if(matrix == null || matrix.length == 0 || matrix[0].length == 0){
            return false;
        }

        int m = matrix.length; // rows
        int n= matrix[0].length; // columns

        int left = 0;
        int right = m * n - 1;

        while(left <= right){

            int mid = (left + right) / 2;

            System.out.println("Mid : "+ mid);

            // Convert 1D index to 2D indices
            int row = mid/n;
            int col = mid%n;

            System.out.println( "row :" + row);
            System.out.println( "col :" + col);

            if(matrix[row][col] == target){
                return true;
            }else if(matrix[row][col] < target){
                left= mid+1;
            }else{
                right = mid - 1;
            }

        }

        return false;
    }
}
