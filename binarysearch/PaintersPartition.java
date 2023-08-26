package leet.code.binarysearch;

public class PaintersPartition {
    public static boolean isPossibleSolution(int[] partitions, int n, int k, int mid) {
        int paintersCount = 1;
        int sum = 0;

        for (int i = 0; i < n; i++) {
            if (sum + partitions[i] <= mid) {
                sum = sum + partitions[i];
            } else {
                paintersCount++;
                if (partitions[i] > mid || paintersCount > k) {
                    return false;
                }
                sum = partitions[i];
            }
        }
        return true;
    }

    public static int solve(int n, int k, int[] partitions) {
        int start = 1;
        int end = n;
        for (int num : partitions) {
            end = end + num;
        }
        int mid = (start + end) / 2;
        int ans = -1;

        while (start <= end) {
            if (isPossibleSolution(partitions, n, k, mid)) {
                ans = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
            mid = (start + end) / 2;
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{10,20,30,40};
        int n = arr.length;
        int k = 2;
        System.out.println(solve(n, k, arr));
    }
}