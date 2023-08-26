package leet.code.binarysearch;

public class NumberOfRotation {
    public static int getNumberOfRotations(int[] arr) {
        int start = 0;
        int n = arr.length;
        int end = arr.length;
        int mid = (start + end) / 2;

        if (end == 1) {
            return start;
        } else if (end == 2) {
            return arr[0] > arr[1] ? 0 : 1;
        } else {
            while (start <= mid) {
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

                if (arr[mid] < arr[n - 1] && arr[n - 1] <= arr[0]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
                mid = (start + end) / 2;
            }
        }
        return 0;
    }

    public static int getIndex(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        if (end == 0) {
            return arr[end] == target ? 0 : -1;
        }

        int pivot = getNumberOfRotations(arr);

        if (arr[pivot] > target && arr[0] >= arr[end] && target <= arr[end]) {
            start = pivot + 1;
        } else {
            end = pivot;
        }
        int mid = (start + end) / 2;

        while (start <= end) {
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
            mid = (start + end) / 2;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 3, 5};
        int target = 5;
        int index = getIndex(arr, target);
        System.out.println(index);
    }
}