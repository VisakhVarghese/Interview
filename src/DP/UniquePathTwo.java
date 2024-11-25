package DP;

import java.util.Arrays;

/**
 * The "Unique Paths II" problem is a variation of the "Unique Paths" problem where some cells
 * in the grid are obstacles, and you need to find the number of unique paths from the top-left corner to
 * the bottom-right corner. You can only move either down or right at any point in time.
 */
public class UniquePathTwo {
    public static void main(String[] args) {
        UniquePathTwo solution = new UniquePathTwo();
        int[][] obstacleGrid = {
                {0, 0, 0},
                {0, 1, 0},
                {0, 0, 0}
        };
        System.out.println("Number of unique paths: " + solution.uniquePathsWithObstacles(obstacleGrid));
    }

    private int  uniquePathsWithObstacles(int[][] obstacleGrid) {
        //m - row
        //n - column

//        System.out.println(Arrays.deepToString(obstacleGrid));

        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;

        // If the starting cell has an obstacle, return 0
        if(obstacleGrid[0][0] == 1){
            return 0;
        }

        // Create a 2D array to store the number of unique paths to each cell
        int[][] dp = new int[m][n];

        // Initialize the starting cell
        dp[0][0] = 1;

        // Initialize the first column
        for(int i=1; i < m; i++){
            dp[i][0] = (obstacleGrid[i][0] == 1) ? 0 : dp[i-1][0];
        }

        // Initialize the first row
        for(int j=1; j < n; j++){
            dp[0][j] = (obstacleGrid[0][j] == 1) ? 0 : dp[0][j-1];
        }

        System.out.println(Arrays.deepToString(dp));

        for(int i = 1 ; i < m ; i++){
            for(int j = 1; j < n; j++) {
              if(obstacleGrid[i][j] == 1){
                  dp[i][j] = 0;
              }else{
                  dp[i][j] = dp[i-1][j] + dp[i][j-1];
              }
            }
        }

        System.out.println(Arrays.deepToString(dp));
        return dp[m-1][n-1];
    }
}
