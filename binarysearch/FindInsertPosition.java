package leet.code.binarysearch;

public class FindInsertPosition {
    public static int getInsertPosition(int[] arr, int target) {
        int start = 1;
        int end = arr.length - 1;
        int mid = (start + end) / 2;
        int insert_pos = -1;

        if (target <= arr[0]) {
            return 0;
        } else if (target > arr[end]) {
            return end + 1;
        } else {
            while (start <= end) {
                if (target >= arr[mid - 1] && target <= arr[mid]) {
                    insert_pos = mid;
                    end = mid-1;
                } else if (arr[mid] > target) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
                mid = (start + end) / 2;
            }
        }
        return insert_pos;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1,4,6,7,8,9};
        int target = 6;
        int position = getInsertPosition(arr, target);
        System.out.printf("Element %d can be inserted at index %d", target, position);
    }
}