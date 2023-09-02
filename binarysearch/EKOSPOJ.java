package leet.code.binarysearch;

import java.util.Arrays;

public class EKOSPOJ {
    public static int getCuttedWoodHeight(int[] tress, int mid) {
        int height = 0;

        for (int i = 0; i < tress.length; i++) {
            int diff = tress[i] - mid;
            if (diff >= 0) {
                height = height + diff;
            }
        }
        return height;
    }

    public static int getSawHeight(int[] tress, int k) {
        int start = 0;
        int end = Arrays.stream(tress).max().getAsInt();
        int mid = start + (end - start) / 2;
        int requiredSawHeight = -1;

        while (start <= end) {
            int height = getCuttedWoodHeight(tress, mid);
            if (height == k) {
                requiredSawHeight = mid;
            }

            if (height > k) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
            mid = start + (end - start) / 2;
        }
        return requiredSawHeight;
    }

    public static void main(String[] args) {
        int[] trees = new int[]{4, 42, 40, 26, 46};
        int k = 20;
        System.out.println(getSawHeight(trees, k));
    }
}