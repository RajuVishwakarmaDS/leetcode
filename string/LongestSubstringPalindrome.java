package leet.code.string;

public class LongestSubstringPalindrome {
    public static void expandAroundIndex(String s, int i, int j) {
        while (i >= 0 && j < s.length() && s.charAt(i) == s.charAt(j)) {
            if (j - i + 1 > max) {
                max = j - i + 1;
                ans = s.substring(i, j + 1);
            }
            i--;
            j++;
        }
    }

    public static String countSubstrings(String s) {
        for (int i = 0; i < s.length(); i++) {
            expandAroundIndex(s, i, i);
            expandAroundIndex(s, i, i + 1);
        }
        max = Integer.MIN_VALUE;
        String temp = ans;
        ans = "";
        return temp;
    }

    static int max = Integer.MIN_VALUE;
    static String ans = "";

    public static void main(String[] args) {
        String s = "babad";
        System.out.println(countSubstrings(s));
    }
}