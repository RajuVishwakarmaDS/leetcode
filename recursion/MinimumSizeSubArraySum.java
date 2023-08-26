package leet.code.recursion;

public class MinimumSizeSubArraySum {
    public static int minSubArrayLen(int target, int[] nums) {
        if (target == 0) {
            return 0;
        }

        if (target < 0) {
            return Integer.MAX_VALUE;
        }

        int mini = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            int ans = minSubArrayLen(target - nums[i], nums);
            if (ans != Integer.MAX_VALUE) {
                mini = Math.min(mini, ans + 1);
            }
        }
        return mini;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{2, 3, 1, 2, 4, 3};
        int target = 7;
        System.out.println(minSubArrayLen(target, arr));
    }
}