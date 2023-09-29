package leet.code.two.pointer;

import java.util.Arrays;

public class MergeTwoSortedArray {
    public static int[] getMergedSortedArray(int[] arr1, int[] arr2) {
        int n1 = arr1.length, n2 = arr2.length;
        int i = 0, j = 0, x = 0;
        int[] ans = new int[n1 + n2];

        while (i < n1 && j < n2) {
            if (arr1[i] <= arr2[j]) {
                ans[x++] = arr1[i++];
            } else {
                ans[x++] = arr2[j++];
            }
        }

        while (i < n1) {
            ans[x++] = arr1[i++];
        }

        while (j < n2) {
            ans[x++] = arr2[j++];
        }

        return ans;
    }

    public static void main(String[] args) {
        int arr1[] = new int[]{1, 3, 4, 5};
        int arr2[] = new int[]{2, 4, 6, 8};
        Arrays.stream(getMergedSortedArray(arr1, arr2)).forEach(x -> System.out.print(x + " "));
    }
}