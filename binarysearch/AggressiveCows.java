package leet.code.binarysearch;

import java.util.Arrays;

// do again
public class AggressiveCows {
    public static boolean isPossibleSolution(int[] stalls, int n, int k, int mid) {
        int cowsCount = 1;
        int distance = 0;
        int lastCowPosition = stalls[0];

        for (int i = 0; i < n; i++) {
            if (distance <= mid) {
                distance = distance + stalls[i] - lastCowPosition;
            } else {
                cowsCount++;
                if (cowsCount > k) {
                    return false;
                } else {
                    lastCowPosition = stalls[i];
                }
            }
        }
        if (cowsCount == k) {
            return true;
        } else {
            return false;
        }
    }

    public static int solve(int n, int k, int[] stalls) {
        Arrays.sort(stalls);
        int start = 1;
        int end = Arrays.stream(stalls).sum();
        int mid = (start + end) / 2;
        int ans = -1;

        while (start <= end) {
            if (isPossibleSolution(stalls, n, k, mid)) {
                ans = mid;
                start = mid + 1;
            } else {
                end = mid - 1;
            }
            mid = (start + end) / 2;
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{10, 1, 2, 7, 5};
        int n = arr.length;
        int k = 2;
        System.out.println(solve(n, k, arr));
    }
}