package leet.code.binarysearch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class KClosestElement {
    public static List<Integer> findClosestElements(int[] arr, int k, int x) {
        ArrayList<String> lst = new ArrayList<>();
        Arrays.stream(arr).forEach(i-> lst.add(""+Math.abs(i-x)));
        return null;

    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5};
        int k = 4;
        int x = 3;
        System.out.println(findClosestElements(arr, k, x));
    }
}