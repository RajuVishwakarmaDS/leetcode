package leet.code.blind75;

public class MinimumInRotatedSortedArray {
    public static int findMin(int[] nums) {
        return getPivot(nums);
    }

    public static int getPivot(int[] nums) {
        int start = 0;
        int n = nums.length;
        int end = n - 1;
        int mid = end - (end - start) / 2;
        while (start < end) {
            if (mid - 1 >= 0 && mid + 1 < n) {
                if (nums[mid - 1] < nums[mid] && nums[mid] > nums[mid + 1]) {
                    return mid;
                }
            }
            if (nums[mid - 1] < nums[mid] && nums[n - 1] > nums[0]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
            mid = end - (end - start) / 2;
        }
        return mid;
    }

    public static void main(String[] args) {
        int[] nums = {2,3,4,5,1};
        System.out.println(findMin(nums));
    }
}
