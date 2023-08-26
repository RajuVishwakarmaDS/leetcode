package leet.code.binarysearch;

import java.util.ArrayList;
import java.util.Arrays;

public class MedianOfTwoSortedArray {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        ArrayList<Integer> nums = new ArrayList<>();
        Arrays.stream(nums1).forEach(nums::add);
        for (int i=0;i<nums2.length;i++) {
            if (nums.size() != 0) {
                int idx = getInsertPosition(nums, nums2[i]);
                nums.add(idx, nums2[i]);
            }else {
                nums.add(nums2[i]);
            }
        }

        System.out.println(nums);
        int idx = nums.size() / 2;
        if (nums.size() % 2 == 0) {
            return (double) (nums.get(idx - 1) + nums.get(idx)) / 2;
        } else {
            return (double) nums.get(idx);
        }
    }

    public static int getInsertPosition(ArrayList<Integer> arr, int target) {
        int start = 1;
        int end = arr.size() - 1;
        int mid = (start + end) / 2;
        int insert_pos = -1;

        if (target <= arr.get(0)) {
            return 0;
        } else if (target > arr.get(end)) {
            return end + 1;
        } else {
            while (start <= end) {
                if (target >= arr.get(mid - 1) && target <= arr.get(mid)) {
                    insert_pos = mid;
                    end = mid - 1;
                } else if (arr.get(mid) > target) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
                mid = (start + end) / 2;
            }
        }
        return insert_pos;
    }

    public static void main(String[] args) {
        int[] nums1 = new int[]{};
        int[] nums2 = new int[]{2, 7};
        System.out.println(findMedianSortedArrays(nums1, nums2));
    }
}