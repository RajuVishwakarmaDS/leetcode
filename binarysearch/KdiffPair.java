package leet.code.binarysearch;

import java.util.Arrays;
import java.util.HashMap;

public class KdiffPair {
    public static int search(int[] arr, int target, int i) {
        int start = i;
        int end = arr.length - 1;
        int mid = (start + end) / 2;

        while (start <= end) {
            int elem = arr[mid];
            if (elem == target) {
                return mid;
            } else if (elem < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
            mid = (start + end) / 2;
        }
        return -1;
    }

    public static int findPairs(int[] nums, int k) {
        Arrays.sort(nums);
        int found = -1;
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int target = Math.abs(k - nums[i]);
            found = search(nums, target, i + found - 1);
            if (found >= 0) {
                map.put("" + nums[i] + "_" + (nums[i] + k), 1);
            }
        }
        System.out.println(map);
        return map.size();
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 3, 1, 5, 4};
        int k = 0;
        System.out.println(findPairs(arr, k));
    }
}