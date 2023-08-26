package leet.code.numbers;

public class PalindromeNumber {
    public static boolean isPalindrome(int x) {
        int rev = 0;
        int copy = x;

        while (x > 0) {
            int rem = x % 10;
            rev = rev * 10 + rem;
            x = x / 10;
        }

        if (copy == rev) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        int num = -121;
        boolean palindrome = isPalindrome(num);
        System.out.println(palindrome);
    }
}