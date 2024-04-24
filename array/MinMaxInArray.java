package leet.code.array;

public class MinMaxInArray {
    public static int getMin(int[] arr) {
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            min = min > arr[i] ? arr[i] : min;
        }
        return min;
    }

    public static int getMax(int[] arr) {
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            max = max < arr[i] ? arr[i] : max;
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 767, 4645, 3456, -4, 5, -56};
        System.out.println(getMax(arr));
        System.out.println(getMin(arr));
    }
}
