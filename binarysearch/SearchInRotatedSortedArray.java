package leet.code.binarysearch;

public class SearchInRotatedSortedArray {
    public static int search(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        int idx = getPivot(arr);
        if (target == arr[idx]) {
            return idx;
        } else if (target < arr[idx] && target <= arr[arr.length - 1]) {
            start = idx + 1;
        } else {
            end = idx - 1;
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

    public static int getPivot(int[] arr) {
        int start = 0;
        int end = arr.length;
        int mid = (start + end) / 2;

        if (arr.length == 1) {
            return 0;
        } else if (arr.length == 2) {
            return arr[0] > arr[1] ? 0 : 1;
        } else {
            while (start <= end) {
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
        int[] arr = new int[]{2,3,5,1,2};
        int target = 1;
        System.out.printf("Element found at index %d", search(arr, target));
    }
}