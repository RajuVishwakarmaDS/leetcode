package leet.code.blind75;

import java.util.HashMap;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        int[] pair = new int[2];
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            if (map.containsKey(target - nums[i])) {
                pair[0] = i;
                pair[1] = map.get(target - nums[i]);
                return pair;
            } else {
                map.put(nums[i], i);
            }
        }
        return pair;
    }

    public static void main(String[] args) {
        int[] arr = {3, 3};
        int target = 6;
        for (int n : twoSum(arr, target)) {
            System.out.print(n + " ");
        }
    }
}