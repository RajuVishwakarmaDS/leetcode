package leet.code.array;

import java.util.ArrayList;

public class IntersectionArrays {
    public static boolean contains(ArrayList<Integer> arr, int num) {
        for (int j : arr) {
            if (j == num) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<>();
        l1.add(1);
        l1.add(2);
        l1.add(4);
        l1.add(6);
        l1.add(8);
        int[] arr2 = new int[]{1, 3, 7};

        for (int n : arr2) {
            if (!contains(l1, n)) {
                l1.add(n);
            }
        }

        System.out.println(l1);
    }
}