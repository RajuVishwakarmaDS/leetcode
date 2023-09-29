package leet.code.sorting;

import java.util.Arrays;

public class MergeSort {
    public static void conquer(int[] arr, int start, int end, int mid) {
        int[] merged = new int[end - start + 1];
        int idx1 = start;
        int idx2 = mid + 1;
        int x = 0;

        while (idx1 <= mid && idx2 <= end) {
            if (arr[idx1] <= arr[idx2]) {
                merged[x++] = arr[idx1++];
            } else {
                merged[x++] = arr[idx2++];
            }
        }

        // for remaining elements
        while (idx1 <= mid) {
            merged[x++] = arr[idx1++];
        }

        while (idx2 <= end) {
            merged[x++] = arr[idx2++];
        }

        for (int i = 0, j = start; i < merged.length; i++, j++) {
            arr[j] = merged[i];
        }
    }

    public static void divide(int[] arr, int start, int end) {
        //single element or invalid array
        if (start >= end) {
            return;
        }

        int mid = (start + end) / 2;

        // left part sort
        divide(arr, start, mid);

        // right part sort
        divide(arr, mid + 1, end);

        // merge
        conquer(arr, start, end, mid);
    }

    public static void main(String[] args) {
        int[] arr = new int[]{4, 5, 13, 2, 12};
        int n = arr.length;
        divide(arr, 0, n - 1);
        Arrays.stream(arr).forEach(x -> System.out.print(x + " "));
    }
}