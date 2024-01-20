package leet.code.array;

public class SubsetSum {
    public static int findElements(int num, int[] nums) {
        // base case
        if (num == 0) {
            return 0;
        }

        if (num < 0) {
            return Integer.MIN_VALUE;
        }

        int min = Integer.MIN_VALUE;
        for (int j : nums) {
            int ans = findElements(num - j, nums);
            if (ans != Integer.MIN_VALUE) {
                min = Math.max(Integer.MIN_VALUE, ans + 1);
            }
        }

        return min;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5};
        for (int num:arr) {
            System.out.println(findElements(num, arr));
        }
    }
}