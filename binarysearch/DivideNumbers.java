package leet.code.binarysearch;

public class DivideNumbers {
    public static int getQuotient(int dividend, int divisor) {
        boolean flag = false;

        if ((dividend < 0 && divisor > 0) || (dividend > 0 && divisor < 0)) {
            flag = true;
        } else if (dividend < 0 && divisor < 0) {
            flag = false;
        }

        dividend = Math.abs(dividend);
        divisor = Math.abs(divisor);

        int start = 0;
        int end = dividend;
        int ans = -1;
        int mid = (start + end) / 2;
        while (start <= end) {
            if (mid * divisor <= dividend) {
                ans = mid;
                start = start + 1;
            } else if (mid * divisor < dividend) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
            mid = (start + end) / 2;
        }

        if (flag) {
            return ans * -1;
        } else {
            return ans;
        }
    }

    public static void main(String[] args) {
        int a = -17;
        int b = -2;
        int quotient = getQuotient(a, b);
        System.out.println("Quotient: " + quotient);
    }
}