package leet.code.two.pointer;

public class ValidPalindromeTwo {
    public static boolean validPalindrome(String s) {
        int n = s.length();
        int start = 0;
        int end = n - 1;
        int cnt = 0;

        while (start <= end) {
            if (s.charAt(start) == s.charAt(end)) {
                start++;
                end--;
            } else {
                start++;
                end--;
                cnt++;
            }
        }

        return cnt <= 1;
    }

    public static void main(String[] args) {
        String s = "abc";
        System.out.println(validPalindrome(s));
    }
}