package leet.code.blind75;

public class BestTimeToBuyStock {
    public static int maxProfit(int[] prices) {
        int i = 0;
        int j = 0;
        int max = 0;
        int n = prices.length;
        while (j < n) {
            if (prices[j] < prices[i]) {
                i = j;
            } else {
                max = Math.max(prices[j] - prices[i], max);
                j++;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        System.out.println(maxProfit(prices));
    }
}
