package leet.code.slidingwindow;

import java.util.HashMap;

public class MaximumSumDistinctSubArray {
    public static long maximumSubarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> count = new HashMap<>();
        int n = nums.length - 1;
        int i = 0;
        int j = 0;
        long max = 0;
        long sum = 0;
        while (i <= n && j <= n) {
            while (j - i < k && j <= n) {
                count.put(nums[j], count.getOrDefault(nums[j], 0) + 1);
                if (count.get(nums[j]) > 1) {
                    i = j;
                    sum = 0;
                    break;
                } else {
                    sum = sum + nums[j];
                    j++;
                }
            }
            max = Math.max(max, sum);
            count.remove(nums[i]);
            if (count.size() > 0) {
                sum = sum - nums[i];
                i++;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = {9, 9, 9, 1, 2, 3};
        int k = 3;
        System.out.println(maximumSubarraySum(arr, k));
    }
}