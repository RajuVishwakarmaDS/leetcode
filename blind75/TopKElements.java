package leet.code.blind75;

import java.util.*;

public class TopKElements {
    public static int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] ans = new int[k];
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        ArrayList<Map.Entry<Integer, Integer>> entries = new ArrayList<>(map.entrySet());
        entries.sort(Map.Entry.comparingByValue());
        int size = entries.size();
        for (int i = 0; i < k; i++) {
            ans[i] = entries.get(size - i - 1).getKey();
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 1, 1, 2, 2, 3};
        for (int num : topKFrequent(arr, 2)) {
            System.out.print(num + " ");
        }
    }
}
