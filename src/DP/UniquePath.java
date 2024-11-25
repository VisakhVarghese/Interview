package DP;

import java.util.Arrays;

/**
 * The "Unique Paths" problem is a common dynamic programming problem where you need to
 * find the number of unique paths from the top-left corner to the bottom-right corner of a grid.
 * You can only move either down or right at any point in time
 */
public class UniquePath {
    public static void main(String[] args) {
        UniquePath solution = new UniquePath();
        int m = 3, n = 7;
        System.out.println("Number of unique paths: " + solution.uniquePaths(m, n));
    }

    private int  uniquePaths(int m, int n) {
        //m - row
        //n - column
        int[][] dp = new int[m][n];

        // Initialize the first row and first column to 1
        for(int i=0; i < m; i++){
            dp[i][0] = 1;
        }

        for(int j=0; j < n; j++){
            dp[0][j] = 1;
        }

        System.out.println(Arrays.deepToString(dp));

        for(int i = 1 ; i < m ; i++){
            for(int j = 1; j < n; j++) {
                dp[i][j] = dp[i-1][j] + dp[i][j-1];
                System.out.println(dp[i][j]);
            }
        }

        System.out.println(Arrays.deepToString(dp));

        return dp[m-1][n-1];
    }
}
