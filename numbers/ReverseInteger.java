package leet.code.numbers;

public class ReverseInteger {
    public static int reverse(int x) {
        boolean sign = x > 0;
        long rev = 0;
        long n = Math.abs(x);

        while (n > 0) {
            long mod = n%10;
            rev = rev*10+mod;
            if (rev > Integer.MAX_VALUE || rev < Integer.MIN_VALUE) {
                return 0;
            }
            n = n/10;
        }

        if (sign) {
            return (int) rev;
        } else {
            return (int) (rev * -1);
        }
    }

    public static void main(String[] args) {
        int n = 1534236;
        int rev = reverse(n);
        System.out.println(rev);
    }
}