package leet.code.binarysearch;

public class FloorAndCeilInArray {
    public static String getCeilAndFloor(int[] arr, int n, int x) {
        int start = 0;
        int end = n - 1;
        int mid = (start + end) / 2;

        while (start <= end) {
            if (arr[mid] == x) {
                return ""+arr[mid]+" "+arr[mid];
            }

            if (arr[mid] > x) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
            mid = (start + end) / 2;
        }

        return ""+arr[end]+" "+arr[start];
    }

    public static void main(String[] args) {
        int[] arr = new int[]{3, 4, 4, 7, 8, 10};
        int x = 6;
        System.out.println(getCeilAndFloor(arr, arr.length, x));
    }
}