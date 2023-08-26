package leet.code.binarysearch;

import java.util.Arrays;

// do again
public class AggressiveCows {
    public static boolean isPossibleSolution(int[] stalls, int n, int k, int mid) {
        int cowsCount = 1;
        int lastCowPosition = stalls[0];

        for (int i = 0; i < n; i++) {
            if (stalls[i] - lastCowPosition >= mid) {
                // place cow
                cowsCount++;
                if (cowsCount == k) {
                    return true;
                }
                lastCowPosition = stalls[i];
            }
        }
        return false;
    }

    public static int solve(int n, int k, int[] stalls) {
        int start = 1;
        Arrays.sort(stalls);
        int end = stalls[n - 1];
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
        int[] arr = new int[]{1, 2, 3, 4, 6};
        int n = arr.length;
        int k = 2;
        System.out.println(solve(n, k, arr));
    }
}