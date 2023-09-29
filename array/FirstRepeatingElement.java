package leet.code.array;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstRepeatingElement {
    public static int getFirstRepeating(int[] nums) {
        LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();
        for (int x : nums) {
            if (map.containsKey(x)) {
                map.put(x, map.get(x) + 1);
            } else {
                map.put(x, 1);
            }
        }

        for (Map.Entry<Integer, Integer> iter : map.entrySet()) {
            if (iter.getValue() > 1) {
                return iter.getKey();
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 5, 3, 4, 3, 5, 6};
        System.out.println(getFirstRepeating(arr));
    }
}