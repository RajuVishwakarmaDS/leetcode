package leet.code.binarysearch;

import java.util.Arrays;

public class TwoSumSortedArray {
    public static int[] twoSum(int[] numbers, int target) {
        int[] ans = new int[2];
        int start = 0;
        int end = numbers.length - 1;
        int mid = (start + end) / 2;

        while (start <= end) {
            if (numbers[start] + numbers[end] == target) {
                ans[0] = start+1;
                ans[1] = end+1;
                return ans;
            } else if (numbers[start] + numbers[end] > target) {
                end = end - 1;
            } else {
                start = start + 1;
            }
            mid = (start + end) / 2;
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{2, 7, 11, 15};
        int target = 9;
        Arrays.stream(twoSum(arr, target)).forEach(x -> System.out.print(x + " "));
    }
}