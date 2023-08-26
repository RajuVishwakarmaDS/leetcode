package leet.code.binarysearch;

import java.util.ArrayList;

public class BookAllocation {
    public static boolean isPossibleSolution(ArrayList<Integer> arr, int m, int n, int mid) {
        int studentCount = 1;
        int pageSum = 0;

        for (int i = 0; i < n; i++) {
            if (arr.get(i) + pageSum <= mid) {
                pageSum = pageSum + arr.get(i);
            } else {
                studentCount++;
                if (studentCount > m || arr.get(i) > mid) {
                    return false;
                }
                pageSum = arr.get(i);
            }
        }
        return true;
    }

    public static int getAllocation(ArrayList<Integer> arr, int m) {
        if (arr.size() < m) {
            return -1;
        } else {
            int start = 0;
            int end = 0;
            for (int num : arr) {
                end = end + num;
            }
            int mid = start + (end - start) / 2;
            int ans = -1;

            while (start <= end) {
                if (isPossibleSolution(arr, m, arr.size(), mid)) {
                    ans = mid;
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }

                mid = start + (end - start) / 2;
            }
            return ans;
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[]{2, 8, 8, 4, 5};
        ArrayList<Integer> lst = new ArrayList<>();
        for (int num : arr) {
            lst.add(num);
        }
        int m = 5;
        int minimum = getAllocation(lst, m);
        System.out.println("Minimum Maximum allocation is: " + minimum);
    }
}