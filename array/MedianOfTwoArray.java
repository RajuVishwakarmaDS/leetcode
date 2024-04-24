package leet.code.array;

public class MedianOfTwoArray {

    public static int[] getMergedSortedArray(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        int i = 0;
        int j = 0;
        int[] merged = new int[n + m];

        int x = 0;
        while (i < n && j < m) {
            if (nums1[i] < nums2[j]) {
                merged[x++] = nums1[i++];
            } else {
                merged[x++] = nums2[j++];
            }
        }
        // push remaining
        while (i < n) {
            merged[x++] = nums1[i++];
        }

        while (j < m) {
            merged[x++] = nums2[j++];
        }

        return merged;
    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] sortedArray = getMergedSortedArray(nums1, nums2);
        int len = sortedArray.length;
        if (len % 2 == 0) {
            return ((double) ((sortedArray[(len / 2 - 1)] + sortedArray[(len / 2)])) / 2);
        } else {
            return sortedArray[len / 2];
        }
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 3};
        int[] nums2 = {2};
        System.out.println(findMedianSortedArrays(nums1, nums2));
    }
}
