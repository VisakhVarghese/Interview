import java.util.Arrays;

/**
 * Question
 * You are climbing a staircase. It takes n steps to reach the top.
 * Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
 * Example 1:
 * Input: n = 2
 * Output: 2
 * Explanation: There are two ways to climb to the top.
 * 1. 1 step + 1 step
 * 2. 2 steps
 * Example 2:
 * Input: n = 3
 * Output: 3
 * Explanation: There are three ways to climb to the top.
 * 1. 1 step + 1 step + 1 step
 * 2. 1 step + 2 steps
 * 3. 2 steps + 1 step
 */
public class ClimbingSrairs {
    public static void main(String[] args) {
        int v =2;
        int result = findTimes(v);
        System.out.println(result);
    }

    private static int findTimes(int v) {

        int[] dp = new int[v+1];
        dp[0]=1;
        dp[1]=1;
        for(int i=2; i<=v; i++){
           dp[i]= dp[i-1]+dp[i-2];
        }
        System.out.println(Arrays.toString(dp));
        return dp[v];
    }
}
