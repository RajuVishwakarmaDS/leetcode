package leet.code.string;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CharCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] str = sc.nextLine().split("");
        LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();
        for (String s : str) {
            int num = Integer.parseInt(s);
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
        }
        for (Map.Entry<Integer, Integer> iterator : map.entrySet()) {
            System.out.println(iterator.getKey() + " : " + iterator.getValue());
        }
        sc.close();
    }
}
