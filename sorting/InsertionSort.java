package leet.code.sorting;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = new int[]{10, 1, 4, 0, 8, 5, 7};
        int n = arr.length;

        for (int i = 1; i < n; i++) {
            int hole = arr[i];
            int idx = i;

            while (arr[idx - 1] > hole) {
                arr[idx] = arr[idx - 1];
                idx--;
                if (idx == 0) {
                    break;
                }
            }
            arr[idx] = hole;
        }

        Arrays.stream(arr).forEach(x -> System.out.print(x + " "));
    }
}