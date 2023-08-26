package leet.code.binarysearch;

public class KthMissingPositiveInteger {
    public static int findKthPositive(int[] arr, int k) {
        int start = 0;
        int n = arr.length;
        int end = n - 1;
        int mid = (start + end) / 2;

        if (arr[n - 1] == n) {
            return arr[n - 1] + k;
        } else {
            while (start <= end) {
                int distance = arr[mid] - 1;
                if (distance < k) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }

                mid = (start+end)/2;
            }
        }
        return arr[mid]-n+k;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{2, 3, 4, 7, 11};
        int k = 5;
        int missing = findKthPositive(arr, k);
        System.out.println(missing);
    }
}