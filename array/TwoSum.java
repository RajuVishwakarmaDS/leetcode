package leet.code.array;

import java.util.Arrays;
import java.util.HashMap;

class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        int size = nums.length;
        int[] arr = new int[2];
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < size; i++) {
            if (map.containsKey(target - nums[i])) {
                arr[1] = i;
                arr[0] = map.get(target - nums[i]);
                break;
            } else {
                map.put(nums[i], i);
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{2,7,11,15};
        int target = 18;
        int[] ans = twoSum(nums, target);
        Arrays.stream(ans).forEach(x -> System.out.print(x + " "));
    }
}