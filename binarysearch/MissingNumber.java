package leet.code.binarysearch;

public class MissingNumber {
    public static int getMissingNumber(int[] arr) {
        int n = arr.length + 1;
        int actual_sum = 0;
        for (int num : arr) {
            actual_sum += num;
        }
        return (n * (n - 1)) / 2 - actual_sum;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{0, 1, 2, 3, 4, 6};
        int missing = getMissingNumber(arr);
        System.out.printf("Missing number is %d", missing);
    }
}