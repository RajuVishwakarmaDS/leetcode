package leet.code.blind75;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GroupAnagram {
    public static boolean isAnagram(String s, String t) {
        int[] chars = new int[26];
        int n = s.length();
        if (s.length() != t.length()) {
            return false;
        } else {
            for (int i = 0; i < n; i++) {
                chars[s.charAt(i) - 'a'] += 1;
                chars[t.charAt(i) - 'a'] -= 1;
            }
            for (int aChar : chars) {
                if (aChar != 0) {
                    return false;
                }
            }
        }
        return true;
    }

    public static List<List<String>> groupAnagrams(String[] strs) {
        ArrayList<String> s = new ArrayList<>(Arrays.stream(strs).toList());
        List<List<String>> ans = new ArrayList<>();
        for (String word : s) {
            ArrayList<String> temp = new ArrayList<>();
            temp.add(word);
            for (int j = 1; j < s.size(); j++) {
                if (isAnagram(word, s.get(j))) {
                    temp.add(s.get(j));
                    s.remove(s.get(j));
                }
            }
            ans.add(temp);
        }
        return ans;
    }

    public static void main(String[] args) {
        String[] strs = {"", "b", ""};
        System.out.println(groupAnagrams(strs));
    }
}
