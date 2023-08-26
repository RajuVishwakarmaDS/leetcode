package leet.code.binarysearch;

public class PeakElement {
    public static int getMountainPeak(int[] nums) {
        int size = nums.length;
        int start = 0;
        int end = size - 1;
        int mid = (start + end) / 2;

        while (start < end) {
            if (nums[mid] < nums[mid + 1]) {
                start = mid + 1;
            } else {
                end = mid;
            }
            mid = (start + end) / 2;
        }
        return start;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 2};
        System.out.printf("Peak element is at %d", getMountainPeak(arr));
    }
}