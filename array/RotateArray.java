package leet.code.array;

import java.util.Arrays;

// important

public class RotateArray {
    public static void rotate(int[] nums, int k) {
        int n = nums.length;
        int[] temp = new int[n];
        if (n > 1) {
            int i = 0;
            while (i + k < n) {
                temp[i + k] = nums[i];
                i++;
            }

            while (i + k >= n && i < n) {
                int idx = (i + k) % n;
                temp[idx] = nums[i++];
            }

            for (i = 0; i < n; i++) {
                nums[i] = temp[i];
            }
        }

        Arrays.stream(nums).forEach(x -> System.out.print(x + " "));
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7};
        int k = 3;
        rotate(arr, k);
    }
}