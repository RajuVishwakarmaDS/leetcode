package leet.code.recursion;

public class ClimbStairs {
    public static int climbStairs(int n) {
        long m = n;
        if (m == 0 || m == 1) {
            return 1;
        }

        long ans = climbStairs(n - 1) + climbStairs(n - 2);
        return (int) ans;
    }

    public static void main(String[] args) {
        int n = 45;
        System.out.println(climbStairs(n));
    }
}