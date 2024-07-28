package leet.code.slidingwindow;

import java.util.HashSet;

public class ContainsDuplicate {
    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        HashSet<Integer> map = new HashSet<>();
        int i = 0;
        for(int j = 0; j < nums.length; j++) {
            if(!map.contains(nums[j])) {
                map.add(nums[j]);
            } else {
                if(Math.abs(j - i) <= k) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 1};
        int k = 3;
        System.out.println(containsNearbyDuplicate(arr, k));
    }
}