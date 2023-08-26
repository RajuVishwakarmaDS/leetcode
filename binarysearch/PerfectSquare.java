package leet.code.binarysearch;

public class PerfectSquare {
    public static boolean isPerfectSquare(int num) {
        int start = 1;
        int end = num;
        int mid = start + (end - start) / 2;

        while (start <= end) {
            long sqr = (long) mid * mid;
            if (sqr == num) {
                return true;
            } else if (sqr < num) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
            mid = start + (end - start) / 2;
        }
        return false;
    }

    public static void main(String[] args) {
        int n = 12;
        System.out.println(isPerfectSquare(n));
    }
}