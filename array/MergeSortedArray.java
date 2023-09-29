package leet.code.array;

public class MergeSortedArray {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = 0;
        int j = 0;
        int[] temp = new int[m + n];

        int x = 0;
        while (i < m && j < n) {
            if (nums1[i] < nums2[j]) {
                temp[x++] = nums1[i++];
            } else {
                temp[x++] = nums2[j++];
            }
        }

        while (i < m) {
            temp[x++] = nums1[i++];
        }

        while (j < n) {
            temp[x++] = nums2[j++];
        }

        for (i = 0; i < m + n; i++) {
            nums1[i] = temp[i];
        }
    }

    public static void main(String[] args) {
        int[] arr1 = {1};
        int[] arr2 = {};
        merge(arr1, 1, arr2, 0);
    }
}