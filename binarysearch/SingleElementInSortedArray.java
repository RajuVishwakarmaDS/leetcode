package leet.code.binarysearch;

public class SingleElementInSortedArray {
    public static int singleNonDuplicate(int[] arr) {
        int start = 0;
        int n = arr.length;
        int end = n - 1;
        int mid = (start + end) / 2;

        while (start <= end) {
            // edge cases
            if (mid == 0) {
                return arr[mid];
            } else if (mid == n - 1) {
                return arr[n - 1];
            }

            if (arr[mid] != arr[mid + 1] && arr[mid] != arr[mid - 1]) {
                return arr[mid];
            }

            if (mid % 2 == 0) {
                if (arr[mid] == arr[mid + 1]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }

            if (mid % 2 == 1) {
                if (arr[mid] == arr[mid - 1]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }

            mid = (start + end) / 2;
        }
        return arr[start];
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 1, 2, 3, 3};
        int single = singleNonDuplicate(arr);
        System.out.println(single);
    }
}