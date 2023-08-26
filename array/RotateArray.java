package leet.code.array;

import java.util.Arrays;

public class RotateArray {
    public static void rotate(int[] nums, int k) {
        int rotation_cnt = 0;
        int n = nums.length;

        while (rotation_cnt < 1) {
            int temp = nums[n - 1];
            int i = 0;
            while (i < n - 1) {
                nums[i] = nums[i + 1];
                i++;
            }
            nums[0] = temp;
            Arrays.stream(nums).forEach(x -> System.out.print(x + " "));
            System.out.println();
            rotation_cnt++;
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7};
        int k = 3;
        rotate(arr, k);
    }
}