package leet.code.binarysearch;

public class BasicSearch {
    public static int getIndex(int[] arr, int size, int target) {
        int start = 0;
        int end = size - 1;
        int mid = (start + end) / 2;

        while (start <= end) {
            int elem = arr[mid];

            if (elem == target) {
                return mid;
            } else if (elem < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
            mid = (start + end) / 2;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{2, 4, 6, 8, 10, 12};
        int size = arr.length;
        int target = 2;

        int idx = getIndex(arr, size, target);
        if (idx == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element found at index: " + idx);
        }
    }
}