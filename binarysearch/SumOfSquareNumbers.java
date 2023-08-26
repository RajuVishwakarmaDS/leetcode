package leet.code.binarysearch;

public class SumOfSquareNumbers {
    public static boolean judgeSquareSum(int c) {
        int start = 0;
        int end = (int) Math.sqrt(c);

        if (c == 0 || c == 1) {
            return true;
        } else {
            while (start <= end) {
                long ans = (long) start * start + (long) end * end;
                if (ans == c) {
                    return true;
                }

                if (ans < c) {
                    start++;
                } else {
                    end--;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int n = 25;
        System.out.println(judgeSquareSum(n));
    }
}