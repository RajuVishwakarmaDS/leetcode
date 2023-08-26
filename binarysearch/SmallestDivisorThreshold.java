package leet.code.binarysearch;

import java.util.Arrays;

public class SmallestDivisorThreshold {

    public static int getSum(int[] arr, int mid) {
        int sum = 0;

        for (int num : arr) {
            sum = (int) (sum + Math.ceil((double) num / mid));
        }
        return sum;
    }

    public static int getSmallestDivisor(int[] arr, int threshold) {
        int start = 1;
        int end = Arrays.stream(arr).max().getAsInt();
        int mid = (start + end) / 2;
        int min = -1;

        while (start <= end) {
            int sum = getSum(arr, mid);

            if (sum <= threshold) {
                min = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
            mid = (start + end) / 2;
        }

        return min;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{21212, 10101, 12121};
        int threshold = 1000000;
        int divisor = getSmallestDivisor(arr, threshold);
        System.out.println(divisor);
    }
}