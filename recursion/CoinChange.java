package leet.code.recursion;

public class CoinChange {
    public static int coinChange(int[] coins, int amount) {
        // base case
        if (amount == 0) {
            return 0;
        }

        if (amount < 0) {
            return Integer.MIN_VALUE;
        }

        int min = Integer.MIN_VALUE;
        for (int i = 0; i < coins.length; i++) {
            int ans = coinChange(coins, amount - coins[i]);
            if (ans != Integer.MIN_VALUE) {
                min = Math.max(Integer.MIN_VALUE, ans + 1);
            }
        }

        return min;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1,2};
        int target = 3;
        System.out.println(coinChange(arr, target));
    }
}