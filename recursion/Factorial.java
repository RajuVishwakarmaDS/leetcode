package leet.code.recursion;

public class Factorial {
    public static int getFactorial(int n) {
        if (n == 1) {
            return 1;
        }

        return n * getFactorial(n - 1);
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println(getFactorial(n));
    }
}