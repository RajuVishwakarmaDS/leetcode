package leet.code.binarysearch;

import java.util.Arrays;

public class KoKoEatingBanana {
    public static int getSum(int[] arr, int mid) {
        int inter_sum = 0;

        for (int j : arr) {
            inter_sum = inter_sum + (int) Math.ceil((double) j / mid);
        }
        return inter_sum;
    }

    public static int minEatingSpeed(int[] piles, int h) {
        int start = 1;
        int end = Arrays.stream(piles).max().getAsInt();

        int mid = (start + end) / 2;

        while (start < end) {
            int sum = getSum(piles, mid);
            if (sum <= h) {
                end = mid;
            } else {
                start = mid + 1;
            }

            mid = (start + end) / 2;
        }
        return start;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{805306368, 805306368, 805306368};
        int h = 1000000000;
        int k = minEatingSpeed(arr, h);
        System.out.println("Minimum K: " + k);
    }
}