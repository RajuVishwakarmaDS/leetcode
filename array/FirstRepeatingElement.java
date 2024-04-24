package leet.code.array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;

public class FirstRepeatingElement {
    public static int getFirstRepeating(int[] nums, int n) {
        LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();
        int idx = 0;
        for (int x : nums) {
            if (map.containsKey(x)) {
                map.put(x, map.get(x) + 1);
            } else {
                map.putIfAbsent(x, 1);
            }
        }

        for (Map.Entry<Integer, Integer> iter : map.entrySet()) {
            if (iter.getValue() > 1) {
                return idx + 1;
            }
            idx++;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{7, 4, 0, 9, 4, 8, 8, 2, 4, 5, 5, 1};
        System.out.println(getFirstRepeating(arr, arr.length));
    }
}