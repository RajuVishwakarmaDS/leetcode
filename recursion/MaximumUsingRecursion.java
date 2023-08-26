package leet.code.recursion;

public class MaximumUsingRecursion {
    public static int getMax(int[] arr, int idx, int max) {
        if (idx == arr.length - 1) {
            return max;
        }

        if (max < arr[idx]) {
            max = arr[idx];
        }
        return getMax(arr, idx + 1, max);
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 5, 3, 7, 5};
        System.out.println(getMax(arr, 0, -1));
    }
}