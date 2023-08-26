package leet.code.binarysearch;

import java.util.Arrays;

public class PivotIndex {
    public static int getPivotIndex(int[] arr) {
        int size = arr.length;
        int sum = Arrays.stream(arr).sum();
        int left_sum = 0;
        int right_sum;

        for (int i = 0; i < size; i++) {
            if (i > 0) {
                left_sum = left_sum + arr[i - 1];
            }
            right_sum = sum - (left_sum + arr[i]);
            if (left_sum == right_sum) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{2, 1, -1};
        int pivot = getPivotIndex(arr);
        System.out.printf("Pivot of array is at %d", pivot);
    }
}