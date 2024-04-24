package leet.code.array;

import java.util.ArrayList;

public class InPlaceReverseArray {
    public static ArrayList<Integer> reverseArray(ArrayList<Integer> lst) {
        int size = lst.size();
        for (int i = 0; i < size / 2; i++) {
            int left = lst.get(i);
            int right = lst.get(size - i - 1);
            lst.set(i, right);
            lst.set(size - i - 1, left);
        }
        return lst;
    }

    public static void main(String[] args) {
        ArrayList<Integer> lst = new ArrayList<>();
        lst.add(1);
        lst.add(2);
        lst.add(3);
        lst.add(4);
        lst.add(5);
        lst.add(6);
        for (int num : reverseArray(lst)) {
            System.out.print(num + " ");
        }
    }
}
