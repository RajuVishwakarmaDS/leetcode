package leet.code.binarysearch;

public class PivotElement {
    public static int getPivot(int[] arr) {
        int start = 0;
        int end = arr.length;
        int mid = (start + end) / 2;

        while (start <= end) {
            if (arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (arr[mid - 1] > arr[mid + 1]) {
                return mid - 1;
            }

            if (arr[start] > arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }

            mid = (start + end) / 2;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1,3,5};
        int elem = arr[getPivot(arr)];
        System.out.println(elem);
    }
}