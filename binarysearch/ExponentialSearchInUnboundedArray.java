package leet.code.binarysearch;

public class ExponentialSearchInUnboundedArray {
    public static int getIndex(int[] arr, int target, int start, int end) {
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

    public static int getIndexOf(int[] arr, int target, int size) {
        int i = 0;

        if (arr[i] == target) {
            return i;
        }

        i = 1;
        while (i < size && arr[i] < target) {
            i = i * 2;
        }

        return getIndex(arr, target, i / 2, Math.min(i, size - 1));
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5, 13, 54, 232};
        System.out.println(getIndexOf(arr, 13, arr.length));
    }
}