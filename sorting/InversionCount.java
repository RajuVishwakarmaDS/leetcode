package leet.code.sorting;

public class InversionCount {
    public static void conguer(long[] arr, int start, int end, int mid) {
        long[] merged = new long[end - start + 1];
        int idx1 = start;
        int idx2 = mid + 1;
        int x = 0;

        while (idx1 <= mid && idx2 <= end) {
            if (arr[idx1] <= arr[idx2]) {
                merged[x++] = arr[idx1++];
            } else {
                // inverted pair is found so increase the count....
                inv_cnt = inv_cnt + (mid - idx1) + 1;
                merged[x++] = arr[idx2++];
            }
        }

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

    public static void divide(long[] arr, int start, int end) {
        if (start >= end) {
            return;
        }
        int mid = start + (end - start) / 2;
        divide(arr, start, mid);
        divide(arr, mid + 1, end);
        conguer(arr, start, end, mid);
    }

    public static void getInversions(long[] arr, int n) {
        divide(arr, 0, n - 1);
    }

    static int inv_cnt = 0;

    public static void main(String[] args) {
        long[] arr = new long[]{1, 9, 6, 4, 5};
        int n = arr.length;
        getInversions(arr, n);
        System.out.println(inv_cnt);
    }
}