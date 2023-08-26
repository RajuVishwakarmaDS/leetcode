package leet.code.recursion;

public class HappyNumber {
    public static boolean makeHappy(int n) {
        if (n < 10) {
            ans = ans + (n % 10) * (n % 10);
        } else {
            while (n > 0) {
                ans = ans + (n % 10) * (n % 10);
                n = n / 10;
            }
        }

        if (ans == 1) {
            return true;
        } else {
            int cpy = ans;
            ans = 0;
            return makeHappy(cpy);
        }
    }

    static int ans = 0;

    public static void main(String[] args) {
        int n = 2;
        System.out.println(makeHappy(n));
    }
}