package leet.code.recursion;

public class BinarySearchUsingRecursion {
    public static int getIndex(int[] arr, int key, int start, int end) {
        int mid = start + (end - start) / 2;
        if (start <= end) {
            if (arr[mid] == key) {
                return mid;
            } else if (arr[mid] > key) {
                return getIndex(arr, key, start, mid-1);
            } else {
                return getIndex(arr, key, mid+1, end);
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 6, 8, 10, 15, 78, 79};
        int key = 78;
        System.out.println(getIndex(arr, key, 0, arr.length-1));
    }
}