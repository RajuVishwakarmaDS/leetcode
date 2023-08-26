package leet.code.binarysearch;

public class Sqrt {
    public static int getSqrt(int num) {
        int start = 0;
        int end = num;
        int mid = (start + end) / 2;
        int sqrt = -1;

        while (start <= end) {
            long sqr = (long) mid * mid;

            if (sqr > num) {
                end = mid - 1;
            } else {
                sqrt = mid;
                start = mid + 1;
            }
            mid = (start + end) / 2;
        }
        return sqrt;
    }

    public static void main(String[] args) {
        int num = 10;
        double sqrt = getSqrt(num);

        int precision = 5;
        double step = 0.1;
        for (int i = 0; i < precision; i++) {
            for (double j = sqrt; j * j <= num; j = j + step) {
                sqrt = j;
            }
            step = step/10;
        }
        System.out.printf("Square root of %d is %f", num, sqrt);
    }
}