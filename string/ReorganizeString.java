package leet.code.string;

import java.util.LinkedHashMap;
import java.util.Map;

public class ReorganizeString {
    static char[] getReplaced(char[] ans, char ch, int freq, int n) {
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            if (cnt < freq) {
                if (i - 1 >= 0 && i + 1 < n && ans[i] != ans[i - 1]) {
                    ans[i] = ch;
                    cnt++;
                } else if (i - 1 == -1 && !Character.isLetter(ch)) {
                    ans[i] = ch;
                    cnt++;
                }
            } else {
                break;
            }
        }
        return ans;
    }

    public static String reorganizeString(String s) {
        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
        StringBuilder sb = new StringBuilder(s);
        int i = 0;
        int n = s.length();

        while (i < n) {
            char c = sb.charAt(i);
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
            i++;
        }

        char[] ans = new char[n];
        for (Map.Entry<Character, Integer> iter : map.entrySet()) {
            int freq = iter.getValue();
            char ch = iter.getKey();
            ans = getReplaced(ans, ch, freq, n);
        }
        return "";
    }

    public static void main(String[] args) {
        String str = "aaabbbefgg";
        System.out.println(reorganizeString(str));
    }
}