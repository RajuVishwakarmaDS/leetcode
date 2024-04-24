package leet.code.array;

import java.util.Arrays;
import java.util.Comparator;

public class KMaxMin {
    static int max = Integer.MIN_VALUE;

    public static int getMax(int[] arr) {
        for (int j : arr) {
            max = Math.max(max, j);
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 767, 4645, 3456, -4, 5, -56};


        System.out.println(getMax(arr));
    }
}
