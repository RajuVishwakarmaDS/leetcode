package leet.code.binarysearch;

import java.util.Arrays;

public class FindFirstLast {
    public static int[] searchRange(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        int mid = (start + end) / 2;
        int f_idx = -1;
        int l_idx = -1;
        int []ans = new int[2];

        while (start <= end) {
            if (nums[mid] == target) {
                f_idx = mid;
                end = mid - 1;
            } else if (nums[mid]>target) {
                end = mid-1;
            }else {
                start = mid+1;
            }
            mid = (start+end)/2;
        }

        start = 0;
        end = nums.length - 1;
        mid = (start + end) / 2;
        while (start <= end) {
            if (nums[mid] == target) {
                l_idx = mid;
                start = mid+1;
            } else if (nums[mid]>target) {
                end = mid-1;
            }else {
                start = mid+1;
            }
            mid = (start+end)/2;
        }

        ans[0] = f_idx;
        ans[1] = l_idx;
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{5, 7, 7, 8, 8, 10};
        int target = 8;
        Arrays.stream(searchRange(arr, target)).forEach(x -> System.out.print(x + " "));
    }
}