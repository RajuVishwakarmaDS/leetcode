package leet.code.string;

public class LongestSubStringWithoutRepeatingChar {
    public static void expandAroundIndex(String s, int i, int j) {
        while (i >= 0 && j < s.length()) {
            String str = s.substring(i, j + 1);
            if (j - i + 1 > max && str.length() == str.replaceAll("(.|\\w+)((?=.+\\1)|\\1)", "").length()) {
                max = j - i + 1;
                ans = str;
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
        String s = "abcabcbb";
        System.out.println(countSubstrings(s));
    }
}