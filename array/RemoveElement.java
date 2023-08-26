package leet.code.array;

import java.util.Arrays;

public class RemoveElement {
    public static int[] removeDuplicates(int[] nums, int key) {
        int start = 0;
        int end = nums.length - 2;
        int cnt = 0;

        while (start <= end) {
            if (nums[start] == key) {
                start++;
            } else {
                nums[cnt] = nums[start];
                cnt++;
                start++;
            }
        }
        nums[cnt] = nums[end];
        for (int i = cnt + 1; i < end + 2; i++) {
            nums[i] = 0;
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{2};
        int key = 3;
        Arrays.stream(removeDuplicates(arr, key)).forEach(x -> System.out.print(x + " "));
    }
}