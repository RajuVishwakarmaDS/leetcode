package leet.code.recursion;

public class LongestPalindromeNormal {
    public static String longestPalindrome(String s) {
        int max = Integer.MIN_VALUE;
        String ans = "";
        int n = s.length();

        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n+1; j++) {
                String temp = s.substring(i, j);
                StringBuilder sb = new StringBuilder(temp);
                int len = temp.length();
                if (sb.reverse().toString().equals(temp) && len > max) {
                    max = len;
                    ans = temp;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        String str = "cccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccc";
        System.out.println(longestPalindrome(str));
    }
}