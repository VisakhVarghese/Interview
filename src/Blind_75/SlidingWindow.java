package Blind_75;

/**
 * Question
 * You are given an array prices where prices[i] is the price of a given stock on the ith day.
 * You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.
 * Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.
 * Example 1:
 * Input: prices = [7,1,5,3,6,4]
 * Output: 5
 * Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
 * Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.
 * Example 2:
 * Input: prices = [7,6,4,3,1]
 * Output: 0
 * Explanation: In this case, no transactions are done and the max profit = 0.
 */

class SlidingWindow {
    public static int maxProfit(int[] prices) {
        int minInd = 0;
        int minPrice = 10000;
        int maxProfit = 0;
        for(int i = 0; i<prices.length; i++) {
            System.out.println(prices[i]+" "+prices[minInd]);
            if(prices[i] < prices[minInd]) {
                System.out.println("Inside loop");
                minInd = i;
                minPrice = prices[i];
                continue;
            }
            int currProfit = prices[i] - prices[minInd];
            System.out.println(currProfit);
            if(currProfit > maxProfit) {
                maxProfit = currProfit;
            }
        }

        return maxProfit;
    }

    public static void main(String[] args) {
        int[] stockValues ={7,6,4,3,1,10,90,45};
        int maxProfit = maxProfit(stockValues);
        System.out.println(maxProfit);
    }
}