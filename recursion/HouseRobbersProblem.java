package leet.code.recursion;

public class HouseRobbersProblem {
    public static int robber(int[] nums, int i) {
        if (i >= nums.length) {
            return 0;
        }
        int amt1 = nums[i] + robber(nums, i + 2);
        int amt2 = robber(nums, i + 1);
        return Math.max(amt1, amt2);
    }

    public static int rob(int[] nums) {
        return robber(nums, i);
    }

    static int i = 0;

    public static void main(String[] args) {
        int[] money = new int[]{2, 1, 1, 2};
        System.out.println(rob(money));
    }
}