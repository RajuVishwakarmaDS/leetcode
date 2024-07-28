package leet.code.blind75;

import java.util.Arrays;

public class LongestConsecutiveSequence {
    public static int longestConsecutive(int[] nums) {
        int max = 1;
        int n = nums.length;
        Arrays.sort(nums);
        int i = 0;
        int j = 1;
        while (i < n && j < n) {
            if (Math.abs(nums[j] - nums[i]) == 1){
                max++;
            }else {
                i = j;
            }
            max = Math.max(max, j - i + 1);
            j++;
        }
        return max;
    }

    public static void main(String[] args) {
        int[] nums = {9, 1, 4, 7, 3, -1, 0, 5, 8, -1, 6};
        System.out.println(longestConsecutive(nums));
    }
}
