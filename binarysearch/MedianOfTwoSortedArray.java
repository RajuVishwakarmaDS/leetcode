package leet.code.binarysearch;

public class MedianOfTwoSortedArray {
    public static int[] getMergedSortedArray(int[] nums1, int[] nums2) {
        int i = 0;
        int j = 0;
        int m = nums1.length;
        int n = nums2.length;
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
        return temp;
    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] merged = getMergedSortedArray(nums1, nums2);
        int idx = merged.length / 2;
        if (merged.length % 2 == 0) {
            return (double) (merged[idx - 1] + merged[idx]) / 2;
        } else {
            return merged[idx];
        }
    }

    public static void main(String[] args) {
        int[] nums1 = new int[]{1, 2};
        int[] nums2 = new int[]{3, 4};
        System.out.println(findMedianSortedArrays(nums1, nums2));
    }
}