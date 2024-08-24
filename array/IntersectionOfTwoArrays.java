package leet.code.array;

import java.util.HashSet;
import java.util.Set;

public class IntersectionOfTwoArrays {
    public static int[] intersection(int[] nums1, int[] nums2) {
        int[] intermediate = new int[1001];
        Set<Integer> ans = new HashSet<>();
        for (int num : nums1) {
            intermediate[num] += 1;
        }
        for (int num : nums2) {
            if (intermediate[num] != 0) {
                ans.add(num);
            }
        }
        int[] intersection = new int[ans.size()];
        int idx = 0;
        for (int num : ans) {
            intersection[idx] = num;
            idx++;
        }
        return intersection;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 2, 1}, nums2 = {2, 2};
        for (int num : intersection(nums1, nums2)) {
            System.out.print(num + " ");
        }
    }
}
