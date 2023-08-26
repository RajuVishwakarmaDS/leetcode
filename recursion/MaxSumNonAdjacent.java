package leet.code.recursion;

public class MaxSumNonAdjacent {
    static int max = 0;

    public static void getMaxSum(int[] arr, int i, int ans) {
        if (i >= arr.length) {
            max = Math.max(ans, max);
            return;
        }

        // include
        getMaxSum(arr, i + 2, ans + arr[i]);

        //exclude
        getMaxSum(arr, i + 1, ans);
    }

    public static void main(String[] args) {
        int[] arr = new int[]{2, 1, 4, 9};
        int i = 0;
        getMaxSum(arr, i, 0);
        System.out.println(max);
    }
}