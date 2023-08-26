package leet.code.recursion;

public class LongestPalindrome {
    public static String longestPalindrome(String s) {
        ans = getSubStrings(s, 0, s.length());
        String temp = ans;
        max = -1;
        ans = "";
        return temp;
    }

    static int st = 0;
    static String output = "";
    static int max = -1;
    static String ans = "";

    public static String getSubStrings(String s, int start, int end) {
        if (start == end) {
            st++;
            start = st;
            output = "";
            getSubStrings(s, start, end);
        } else {
            if (start < end) {
                output = output + s.charAt(start);
                StringBuilder sb = new StringBuilder(output);
                if (sb.reverse().toString().equals(output) && output.length() > max) {
                    max = output.length();
                    ans = output;
                }
                getSubStrings(s, start + 1, end);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        String s = "cbbd";
        System.out.println(longestPalindrome(s));
    }
}