package leet.code.array;

public class MoveNegative {
    public static void main(String[] args) {
        int[] arr = new int[]{0, 1, 5, -1, 3, -2};
        int neg_idx = 0;
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            if (arr[i] < 0) {
                int temp = arr[i];
                arr[i] = arr[neg_idx];
                arr[neg_idx] = temp;
                neg_idx++;
            }
        }

        for (int i : arr) {
            System.out.print(i+" ");
        }
    }
}