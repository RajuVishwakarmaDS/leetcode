package leet.code.binarysearch;

public class TwoDSearch {
    private static boolean findElement(int[][] arr, int target) {
        int start = 0;
        int rows = arr.length;
        int cols = arr[0].length;
        int end = (rows * cols) - 1;
        int mid = (start + end) / 2;

        while (start <= end) {
            int row_idx = mid / cols;
            int col_idx = mid % cols;
            if (arr[row_idx][col_idx] == target) {
                return true;
            } else if (arr[row_idx][col_idx] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
            mid = (start + end) / 2;
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] arr = new int[][]{{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}};
        int target = 3;
        boolean found = findElement(arr, target);
        System.out.println(found);
    }
}