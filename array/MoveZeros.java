package leet.code.array;

import java.util.Arrays;

public class MoveZeros {
    public static void inplaceReplace(int[] nums, int i, int n) {
        int start = i;
        while (start < n - 1) {
            if (nums[++start] != nums[i]) {
                int temp = nums[start];
                nums[start] = nums[i];
                nums[i] = temp;
                break;
            }
        }
    }

    public static void moveZeroes(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            if (nums[i] == 0) {
                inplaceReplace(nums, i, n);
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};
        //[1,3,12,0,0]
        moveZeroes(nums);
        Arrays.stream(nums).forEach(x -> System.out.print(x + " "));
    }
}