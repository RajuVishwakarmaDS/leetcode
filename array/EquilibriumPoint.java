package leet.code.array;

public class EquilibriumPoint {

    public static int equilibriumPoint(long[] arr, int n) {
        long sum = 0;
        long leftSum = 0;
        long rightSum;

        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }

        if (n == 1) {
            return 1;
        } else {
            for (int i = 1; i < n; i++) {
                leftSum += arr[i - 1];
                rightSum = sum - (leftSum + arr[i]);

                if (leftSum == rightSum) {
                    return i + 1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int n = 2;
        long arr[] = {1, 0};
        System.out.println(equilibriumPoint(arr, n));
    }
}
