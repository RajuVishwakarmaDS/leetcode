package leet.code.binarysearch;

public class FindMinimumInRotatedSortedArray {
    public static int findMin(int[] nums) {
        int pivot = getPivot(nums);
        int start = 0;
        int n = nums.length;
        int end = n - 1;

        if (pivot == end) {
            return nums[start];
        } else if (nums[pivot] > nums[end] && nums[end] < nums[0]) {
            return nums[pivot + 1];
        } else {
            return nums[start];
        }
    }

    public static int getPivot(int[] arr) {
        int start = 0;
        int n = arr.length;
        int end = arr.length - 1;
        int mid = (start + end) / 2;

        if (n == 1) {
            return 0;
        } else if (n == 2) {
            return arr[0] > arr[1] ? 0 : 1;
        } else if (arr[n - 1] > arr[0]) {
            return 0;
        } else {
            while (start <= end) {
                if (mid == 0) {
                    return arr[0] > arr[1] ? 0 : 1;
                }
                if (mid == n - 1) {
                    return arr[n - 1] > arr[n - 2] ? n - 1 : n - 2;
                }

                if (arr[mid] > arr[mid + 1]) {
                    return mid;
                }
                if (arr[mid - 1] > arr[mid]) {
                    return mid - 1;
                }

                if (arr[start] > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }

                mid = (start + end) / 2;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{4, 5, 6, 7, 0, 1, 2};
        int min = findMin(arr);
        System.out.println(min);
    }
}