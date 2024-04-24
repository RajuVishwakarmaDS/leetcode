package leet.code.recursion;

public class RecursionBasics {
    public static void printTillN(int n) {
        if (n == 0) {
            return;
        }
        printTillN(--n);
        System.out.print(n + " ");
    }

    public static int getMean(int[] arr, int n) {
        if (n == 1) {
            return arr[0];
        }
        return arr[n - 1] + getMean(arr, --n);
    }

    public static String getBinary(int n) {
        if (n == 0) {
            return "" + n;
        }
        return n % 2 + getBinary(n / 2);
    }

    public static String getReverse(String s, int n) {
        if (n <= 0) {
            return "";
        }
        return s.charAt(n - 1) + getReverse(s, --n);
    }

    public static int sumDigit(int n) {
        if (n == 0) {
            return 0;
        }
        return n % 2 + sumDigit(n / 2);
    }

    public static void getFibonacci(int a, int b) {
        if (a + b > 100) {
            return;
        }
        System.out.print(a + b + " ");
        getFibonacci(b, a + b);
    }

    public static int getFactorial(int n) {
        if (n == 1) {
            return 1;
        }
        return n * getFactorial(n - 1);
    }

    public static int getMinimum(int[] arr, int n) {
        if (n == 1) {
            return arr[0];
        }
        return Math.min(arr[n - 1], getMinimum(arr, --n));
    }

    public static int getMaximum(int[] arr, int n) {
        if (n == 1) {
            return arr[0];
        }
        return Math.max(arr[n - 1], getMaximum(arr, --n));
    }

    public static void checkPalindrome(String s, int n){

    }

    public static void main(String[] args) {
        printTillN(10);
        int[] arr = {1, 2, 3, 4};
        System.out.println("\n" + getMean(arr, arr.length) / arr.length);
        System.out.println(new StringBuilder(getBinary(12345)).reverse());
        String s = "raju vishwakarma";
        System.out.println(getReverse(s, s.length()));
        System.out.println(sumDigit(12345));
        getFibonacci(0, 1);
        System.out.println();
        System.out.println(getFactorial(5));
        System.out.println(getMinimum(arr, arr.length));
        System.out.println(getMaximum(arr, arr.length));
    }
}
