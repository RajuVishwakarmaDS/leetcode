package leet.code.blind75;

import java.util.HashMap;

public class ContainsDuplicate {
    public static boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> numberFrequency = new HashMap<>();
        for (int n : nums) {
            numberFrequency.put(n, numberFrequency.getOrDefault(n, 0) + 1);
            if (numberFrequency.get(n) >= 2) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        System.out.println(containsDuplicate(nums));
    }
}