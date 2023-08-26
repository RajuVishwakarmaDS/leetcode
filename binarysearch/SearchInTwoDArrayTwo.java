package leet.code.binarysearch;

public class SearchInTwoDArrayTwo {
    public static int findTarget(int[][] arr, int i, int colN, int target) {
        int start = i;
        int end = colN - 1;
        int mid = (start + end) / 2;

        while (start <= end) {
            if (arr[i][mid] == target) {
                return mid;
            } else if (arr[i][mid] < target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }

    public static int getIndex(int[][] arr, int target) {
        int row_n = arr.length;
        int col_n = arr[0].length;
        int start = 0;
        int end = row_n * col_n - 1;
        int mid = (start + end) / 2;
        int idx = -1;

        while (start <= end) {
            int i = mid / 2;
            int j = mid % 2;
            if (arr[i][j] == target) {
                idx = arr[i][j];
            } else if (arr[i][j] < target) {
                idx = findTarget(arr, i, col_n, target);
                if (idx >= 0) {
                    return idx;
                } else {
                    start = mid + 1;
                }
            } else {
                idx = findTarget(arr, 0, mid, target);
                if (idx >= 0) {
                    return idx;
                } else {
                    end = mid - 1;
                }
            }
            mid = (start + end) / 2;
        }
        return idx;
    }

    public static void main(String[] args) {
        int[][] arr = new int[][]{{1, 4, 7, 11, 15}, {2, 5, 8, 12, 19}, {3, 6, 9, 16, 22}, {10, 13, 14, 17, 24}, {18, 21, 23, 26, 30}};
        int target = 22;
        int idx = getIndex(arr, target);
        System.out.println(idx);
    }
}