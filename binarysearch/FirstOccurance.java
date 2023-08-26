package leet.code.binarysearch;

public class FirstOccurance {
    public static int getFirstOccurance(int[] arr, int size, int target) {
        int idx = -1;
        int start = 0;
        int end = size - 1;
        int mid = (start + end) / 2;

        while (start <= end) {
            int elem = arr[mid];

            if (elem == target) {
                idx = mid;
                end = mid - 1;
            } else if (target< elem) {
                end = mid - 1;
            } else if (elem < target) {
                start = mid + 1;
            }
            mid = (start + end) / 2;
        }
        return idx;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 3, 4, 4, 4, 4, 4, 6, 7};
        int size = arr.length;
        int target = 4;

        int getIdx = getFirstOccurance(arr, size, target);
        System.out.printf("first occurance of %d is at %d%n", target, getIdx);
    }
}
