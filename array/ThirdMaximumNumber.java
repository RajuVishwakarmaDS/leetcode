package leet.code.array;

import java.util.Arrays;

public class ThirdMaximumNumber {
    public static int thirdMax(int[] nums) {
        int max = Integer.MIN_VALUE;
        int n = nums.length;
        for (int num : nums) {
            max = Math.max(num, max);
        }
        if (n < 3) {
            return max;
        } else {
            Arrays.sort(nums);
            int cnt = 0;
            for (int i = n - 1; i >= 0; i--) {
                if (i == 0) {
                    if (cnt == 3) {
                        return nums[i];
                    } else {
                        return max;
                    }
                } else if (nums[i - 1] == nums[i]) {
                    i--;
                } else {
                    cnt++;
                    if (cnt == 3) {
                        return nums[i];
                    }
                }
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 2};
        System.out.println(thirdMax(arr));
    }
}
