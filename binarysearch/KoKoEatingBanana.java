package leet.code.binarysearch;

import java.util.Arrays;

public class KoKoEatingBanana {
    public static int getSum(int[] arr, int mid) {
        return Arrays.stream(arr).reduce(0, (ans, x) -> (int) (ans + Math.ceil((double) x / mid)));
    }

    public static int minEatingSpeed(int[] piles, int h) {
        int start = 0;
        int end = Arrays.stream(piles).max().getAsInt();
        int mid = end - (end - start) / 2;

        while (start <= end) {
            int rate = getSum(piles, mid);
            if (rate == h) {
                return mid;
            } else if (rate > h) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
            mid = end - (end - start) / 2;
        }
        return start;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{30, 11, 23, 4, 20};
        int h = 6;
        int k = minEatingSpeed(arr, h);
        System.out.println("Minimum K: " + k);
    }
}