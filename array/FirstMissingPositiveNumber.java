package leet.code.array;

public class FirstMissingPositiveNumber {
    public static int firstMissingPositive(int[] nums) {
        int n = nums.length;
        boolean[] random = new boolean[n + 1];

        for (int i = 0; i < n; i++) {
            if (nums[i] >= 0 && nums[i] <= n) {
                random[nums[i]] = true;
            }
        }

        int i;
        for (i = 1; i <= n; i++) {
            if (!random[i]) {
                return i;
            }
        }

        return i;
    }

    public static void main(String[] args) {
        int[] arr = {1};
        System.out.println(firstMissingPositive(arr));
    }
}
