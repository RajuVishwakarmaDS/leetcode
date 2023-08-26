package leet.code.array;

import java.util.Arrays;

public class RemoveDuplicates {
    public static int[] removeDuplicates(int[] nums) {
        int start = 0;
        int end = nums.length - 2;
        int cnt = 0;

        while (start <= end) {
            if (nums[start] == nums[start + 1]) {
                start++;
            } else {
                nums[cnt] = nums[start];
                cnt++;
                start++;
            }
        }
        nums[cnt] = nums[end + 1];

        for (int i = cnt + 1; i < end + 2; i++) {
            nums[i] = 0;
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        Arrays.stream(removeDuplicates(arr)).forEach(x -> System.out.print(x + " "));
    }
}