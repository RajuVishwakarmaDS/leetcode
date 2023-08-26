package leet.code.array;

import java.util.Arrays;

public class MaximumGap {
    public static int maximumGap(int[] nums) {
        int n = nums.length;
        int max = 0;
        if (n < 1) {
            return max;
        } else {
            Arrays.sort(nums);
            for (int i = 0; i < n - 1; i++) {
                max = Math.max((nums[i + 1] - nums[i]), max);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{3, 6, 9, 1};
        int get_max_gap = maximumGap(arr);
        System.out.println(get_max_gap);
    }
}