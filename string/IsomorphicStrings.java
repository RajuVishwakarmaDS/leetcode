package leet.code.string;

import java.util.HashMap;

public class IsomorphicStrings {
    public static boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> map = new HashMap<>();
        StringBuilder sb1 = new StringBuilder(s);
        StringBuilder sb2 = new StringBuilder(t);
        int n = s.length();

        if (t.length() != n) {
            return false;
        } else {
            int i = 0;
            while (i < n) {
                if (map.containsKey(sb1.charAt(i))) {
                    if (map.get(sb1.charAt(i)) != sb2.charAt(i)) {
                        return false;
                    }
                } else {
                    if (map.containsValue(sb2.charAt(i))) {
                        return false;
                    }
                    map.put(sb1.charAt(i), sb2.charAt(i));
                }
                i++;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "badc";
        String t = "baba";
        System.out.println(isIsomorphic(s, t));
    }
}