package leet.code.string;

import java.util.HashMap;
import java.util.Map;

public class StringCompression {
    public static int compress(char[] chars) {
        HashMap<Character, Integer> map = new HashMap<>();
        int n = chars.length;

        for (int i = 0; i < n; i++) {
            if (map.containsKey(chars[i])) {
                map.put(chars[i], map.get(chars[i]) + 1);
            } else {
                map.put(chars[i], 1);
            }
        }

        int i = -1;
        for (Map.Entry<Character, Integer> iter : map.entrySet()) {
            if (iter.getValue() == 1) {
                chars[++i] = iter.getKey();
            } else {
                chars[++i] = iter.getKey();
                chars[++i] = (char)(iter.getValue()+'0');
            }
        }

        return chars.length;
    }

    public static void main(String[] args) {
        char[] ch = {'a', 'a', 'b', 'b', 'c', 'c', 'c' };
        System.out.println(compress(ch));
    }
}