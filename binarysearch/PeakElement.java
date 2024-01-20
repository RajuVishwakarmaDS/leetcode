package leet.code.binarysearch;

public class PeakElement {
    public static int getMountainPeak(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        int mid = end - (end - start) / 2;

        while (start < end) {
            if (arr[mid] > arr[mid - 1]) {
                start = mid;
            } else {
                end = mid - 1;
            }
            mid = end - (end - start) / 2;
        }
        return start;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 2};
        System.out.printf("Peak element is at %d", getMountainPeak(arr));
    }
}