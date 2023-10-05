package leet.code.array;

public class JumpGame {
    public static boolean jump(int[] nums, int n, int i) {
        if (i == n) {
            return true;
        }
        return jump(nums, n, i + nums[i]);
    }

    public static boolean canJump(int[] nums) {
        int n = nums.length - 1;
        int i = 0;
        return jump(nums, n, i);
    }

    public static void main(String[] args) {
        int[] arr = new int[]{3, 2, 1, 0, 4};
        System.out.println(canJump(arr));
    }
}