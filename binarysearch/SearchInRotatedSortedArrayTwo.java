package leet.code.binarysearch;

public class SearchInRotatedSortedArrayTwo {
    public static Boolean search(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        if (end == 0) {
            return arr[end] == target;
        }

        int pivot = getNumberOfRotations(arr);

        if (arr[pivot] > target && arr[0] >= arr[end] && target <= arr[end]) {
            start = pivot + 1;
        } else {
            if (arr[0] >= arr[end]) {
                end = pivot;
            }
        }
        int mid = (start + end) / 2;

        while (start <= end) {
            if (arr[mid] == target) {
                return true;
            } else if (arr[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
            mid = (start + end) / 2;
        }
        return false;
    }

    public static int getNumberOfRotations(int[] arr) {
        int start = 0;
        int n = arr.length;
        int end = arr.length - 1;
        int mid = (start + end) / 2;

        if (end == 0) {
            return start;
        } else if (end == 1) {
            return arr[0] > arr[1] ? 0 : 1;
        } else if (arr[end] > arr[0]) {
            return 0;
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

                if (arr[start] == arr[mid] || arr[end] == arr[end - 1]) {
                    if (arr[start] == arr[mid]) {
                        start = start + 1;
                    }
                    if (arr[end] == arr[end - 1]) {
                        end = end - 1;
                    }
                } else {
                    if (arr[mid] <= arr[arr.length - 1] && arr[n - 1] <= arr[0]) {
                        end = mid - 1;
                    } else {
                        start = mid + 1;
                    }
                }
                mid = (start + end) / 2;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{3, 1, 1};
        int target = 3;
        boolean found = search(arr, target);
        System.out.println(found);
    }
}