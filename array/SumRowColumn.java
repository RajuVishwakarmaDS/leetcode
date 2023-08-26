package leet.code.array;

public class SumRowColumn {
    public static void main(String[] args) {
        int[][] arr = new int[][]{{1,2,3,4}, {5,6,7,8}, {9,10,11,12}};
        int row_cnt = arr.length;
        int col_cnt = arr[0].length;

        for (int i=0;i<row_cnt;i++){
            int row_sum = 0;
            for (int j=0;j<col_cnt;j++){
                row_sum = row_sum+arr[i][j];
            }
            System.out.println("row: %d, sum: %d".formatted(i, row_sum));
        }

        System.out.println("==================================");

        for (int i=0;i<col_cnt;i++){
            int col_sum = 0;
            for (int[] ints : arr) {
                col_sum = col_sum + ints[i];
            }
            System.out.println("col: %d, sum: %d".formatted(i, col_sum));
        }
    }
}