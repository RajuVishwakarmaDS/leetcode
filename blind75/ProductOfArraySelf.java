package leet.code.blind75;

public class ProductOfArraySelf {
    public static int[] productExceptSelf(int[] nums) {
        int maxProduct = 1;
        int n = nums.length;
        int[] ans = new int[n];
        for (int num : nums) {
            if (num != 0) {
                maxProduct *= num;
            }
        }
        for (int i = 0; i < n; i++) {
            if (nums[i] == 0) {
                ans[i] = 0;
            } else {
                ans[i] = maxProduct / (nums[i]);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{-1, 1, 0, -3, 3};
        for (int n : productExceptSelf(arr)) {
            System.out.print(n + " ");
        }
    }
}
