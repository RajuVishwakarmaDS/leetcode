package leet.code.binarysearch;

public class DivideTwoNumbers {
    public static int divide(long divid, long div) {
        long dividend = divid;
        long divisor = div;
        boolean flag = false;
        if ((dividend < 0 && divisor > 0) || (dividend > 0 && divisor < 0)) {
            flag = true;
        } else if (dividend < 0 && divisor < 0) {
            flag = false;
        }

        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        } else if (dividend == Integer.MIN_VALUE && divisor == 1) {
            return Integer.MIN_VALUE;
        } else if (dividend == Integer.MAX_VALUE && divisor == -1) {
            return Integer.MIN_VALUE + 1;
        } else if (dividend == Integer.MAX_VALUE && divisor == 1) {
            return Integer.MAX_VALUE;
        }

        dividend = Math.abs(dividend);
        divisor = Math.abs(divisor);

        long start = -dividend;
        long end = dividend;
        long mid = start + (end - start) / 2;
        long quotient = -1;

        while (start <= end) {
            long product = mid * divisor;
            if (product <= dividend) {
                quotient = mid;
                start = mid + 1;
            } else {
                end = mid - 1;
            }
            mid = start + (end - start) / 2;
        }

        if (flag) {
            return (int) (quotient * -1);
        } else {
            return (int) quotient;
        }
    }

    public static void main(String[] args) {
        int dividend = -2147483648;
        int divisor = 2;
        int quotient = divide(dividend, divisor);
        System.out.println(quotient);
    }
}