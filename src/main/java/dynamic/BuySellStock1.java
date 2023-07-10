package dynamic;

public class BuySellStock1 {
    // https://leetcode.com/problems/best-time-to-buy-and-sell-stock
    public static int maxProfit(int[] prices) {
        int max = 0;
        int lowPrice = Integer.MAX_VALUE;

        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < lowPrice) {
                lowPrice = prices[i];
            }

            int profit = prices[i] - lowPrice;
            if (profit > max) {
                max = profit;
            }
        }

        return max;
    }

    public static void main(String[] args) {
        int[] prices = {7,6,4,3,1};
        System.out.println(maxProfit(prices));
    }
}
