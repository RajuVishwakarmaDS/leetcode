package leet.code.string;

public class ValidPalindromeTwo {
    public static boolean isPalindrome(String s, int idx) {
        String temp = s.substring(0, idx) + s.substring(idx + 1);
        int start = 0;
        int end = temp.length() - 1;

        while (start <= end) {
            if (temp.charAt(start) != temp.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public static boolean validPalindrome(String s) {
        int n = s.length();
        int start = 0;
        int end = n - 1;

        while (start <= end) {
            if (s.charAt(start) == s.charAt(end)) {
                start++;
                end--;
            } else {
                if (isPalindrome(s, start) || isPalindrome(s, end)) {
                    return true;
                } else {
                    return false;
                }
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String s = "abc";
        System.out.println(validPalindrome(s));
    }
}