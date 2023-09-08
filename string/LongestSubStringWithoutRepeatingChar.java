package leet.code.string;

import java.util.HashSet;

public class LongestSubStringWithoutRepeatingChar {
    public static boolean isNonRepeating(String str) {
        StringBuilder sb = new StringBuilder(str);
        HashSet<Character> set = new HashSet<>();
        for (int i = 0; i < sb.length(); i++) {
            char ch = sb.charAt(i);
            if (set.contains(ch)){
                return false;
            }else {
                set.add(ch);
            }
        }
        return true;
    }

    public static void expandAroundIndex(String s, int i, int j) {
        while (i >= 0 && j < s.length()) {
            String str = s.substring(i, j + 1);
            if (j - i + 1 > max && isNonRepeating(str)) {
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