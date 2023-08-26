package leet.code.recursion;

public class MaximumSegment {
    public static int minCost(int n, int[] cuts) {
        // base case
        if (n == 0) {
            return 0;
        }

        if (n < 0) {
            return Integer.MIN_VALUE;
        }

        int cnt = 0;
        for (int i = 0; i < cuts.length; i++) {
            minCost(n - cuts[i], cuts);
            cnt = Math.max(Integer.MIN_VALUE, cnt + 1);
        }
        return cnt;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{2, 3};
        int n = 7;
        System.out.println(minCost(n, arr));
    }
}