package leet.code.binarysearch;

public class MountainArray {
    public static int getMountainPeak(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        int mid = (start + end) / 2;

        while (start < end) {
            if (arr[mid] < arr[mid + 1]) {
                start = mid + 1;
            } else {
                end = mid;
            }
            mid = (start + end) / 2;
        }
        return start;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{0,2,1,0};
        System.out.printf("Peak element is at %d", getMountainPeak(arr));
    }
}