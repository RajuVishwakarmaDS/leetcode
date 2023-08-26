package leet.code.recursion;

public class NumberOfDigit {
    public static int getDigitCount(int n) {
        if (n <= 0) {
            return 0;
        }
        return 1 + getDigitCount(n / 10);
    }

    public static void main(String[] args) {
        int num = 1236747465;
        System.out.println(getDigitCount(num));
    }
}