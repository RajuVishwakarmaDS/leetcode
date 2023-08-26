package leet.code.binarysearch;

public class NearlySortedArray {
    public static int getIndex(int[] arr, int target) {
        int start = 0;
        int end = arr.length;
        int mid = (start + end) / 2;

        while (start <= end) {
            if (arr[mid] == target) {
                return mid;
            } else if (mid > 0 && arr[mid - 1] == target) {
                return mid - 1;
            } else if (mid < end - 1 && arr[mid + 1] == target) {
                return mid + 1;
            }

            if (arr[mid] > target) {
                end = mid - 2;
            } else {
                start = mid + 2;
            }
            mid = (start + end) / 2;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{0, 2, 7, 3, 55, 78, 101};
        int target = 101;
        int idx = getIndex(arr, target);
        System.out.println("Found at: " + idx);
    }
}