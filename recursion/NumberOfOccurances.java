package leet.code.recursion;

public class NumberOfOccurances {
    static int getTotalOccurances(int[] arr, int i, int key, int count) {
        if (i > arr.length - 1) {
            return count;
        }

        if (arr[i] == key) {
            count++;
        }

        return getTotalOccurances(arr, i + 1, key, count);
    }

    public static void main(String[] args) {
        int[] arr = new int[]{5, 8, 5, 3, 9, 0, 1};
        int key = 5;
        System.out.println(getTotalOccurances(arr, 0, key, 0));
    }
}