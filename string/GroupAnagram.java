package leet.code.string;

import java.util.*;

public class GroupAnagram {
    public static String getSorted(String str) {
        char[] ch = str.toCharArray();
        Arrays.sort(ch);
        return String.valueOf(ch);
    }

    public static List<List<String>> groupAnagrams(String[] strs) {
        LinkedHashMap<String, String> map = new LinkedHashMap<>();
        ArrayList<ArrayList<String>> lst = new ArrayList<>();
        int n = strs.length;

        for (int i = 0; i < n; i++) {
            map.put(strs[i], getSorted(strs[i]));
        }
        System.out.println(map);
        return null;
    }

    public static void main(String[] args) {
        String[] str = {"eat", "tea", "tan", "ate", "nat", "bat"};
        // [["bat"],["nat","tan"],["ate","eat","tea"]]
        System.out.println(groupAnagrams(str));
    }
}