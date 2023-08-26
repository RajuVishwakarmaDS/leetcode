package leet.code.recursion;

public class CheckArraySorted {
    public static boolean isSorted(int[] arr, int i, int size) {
        if (size == i - 1) {
            return true;
        }

        if (i < size - 1 && !(arr[i] <= arr[i + 1])) {
            return false;
        }

        return isSorted(arr, i + 1, size);
    }

    public static void main(String[] args) {
        int arr[] = new int[]{2, 6, 7, 9, 12, 11};
        System.out.println(isSorted(arr, 0, arr.length));
    }
}