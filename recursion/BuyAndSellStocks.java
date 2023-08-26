package leet.code.recursion;

public class BuyAndSellStocks {
    public static int maxProfit(int[] prices) {
        if (start == prices.length) {
            slow_pointer++;
            start = slow_pointer + 1;
            maxProfit(prices);
        } else {
            if (start < prices.length) {
                max_profit = Math.max(max_profit, prices[start] - prices[slow_pointer]);
                start++;
                maxProfit(prices);
            }
        }
        return max_profit;
    }

    static int max_profit = 0;
    static int slow_pointer = 0;
    static int start = slow_pointer + 1;

    public static void main(String[] args) {
        int[] arr = new int[]{7, 6, 40, 3, 1};
        System.out.println(maxProfit(arr));
    }
}