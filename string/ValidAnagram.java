package leet.code.string;

import java.util.HashMap;
import java.util.Map;

public class ValidAnagram {
    public static boolean isAnagram(String s, String t) {
        HashMap<String, Integer> map1;
        HashMap<String, Integer> map2;
        if (s.length() != t.length()) {
            return false;
        } else {
            int n = s.length();
            String[] s1 = s.split("");
            String[] s2 = t.split("");
            map1 = new HashMap<>();
            map2 = new HashMap<>();
            // get all frequencies
            for (int i = 0; i < n; i++) {
                if (map1.containsKey(s1[i])) {
                    map1.put(s1[i], map1.get(s1[i]) + 1);
                } else {
                    map1.put(s1[i], 1);
                }

                if (map2.containsKey(s2[i])) {
                    map2.put(s1[i], map2.get(s1[i]) + 1);
                } else {
                    map2.put(s2[i], 1);
                }
            }
        }
        return map1.equals(map2);
    }

    public static void main(String[] args) {
        String s = "anagram";
        String t = "margana";
        System.out.println(isAnagram(s, t));
    }
}