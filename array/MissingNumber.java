package leet.code.array;

public class MissingNumber {

    public static int getMissing(int[] arr, int n) {
        int sum = ((2 + (n - 1)) * n) / 2;
        int actualSum = 0;

        for (int i = 0; i < n - 1; i++) {
            actualSum += arr[i];
        }
        return sum - actualSum;
    }

    public static void main(String[] args) {
        int[] arr = {2};
        int n = 2;
        System.out.println(getMissing(arr, n));
    }
}
