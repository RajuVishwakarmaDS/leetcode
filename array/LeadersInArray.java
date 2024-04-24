package leet.code.array;

import java.util.ArrayList;

public class LeadersInArray {
    public static ArrayList<Integer> getLeaders(int[] arr, int n) {
        n = n - 1;
        ArrayList<Integer> lst = new ArrayList<>();
        int currentLeader = arr[n];
        lst.add(arr[n]);

        for (int i = n - 1; i >= 0; i--) {
            int currentNumber = arr[i];

            if (currentNumber >= currentLeader) {
                currentLeader = currentNumber;
                lst.add(0, currentLeader);
            }
        }
        return lst;
    }

    public static void main(String[] args) {
        int[] arr = {16, 17, 4, 3, 5, 2};
        int n = arr.length;

        for (int x : getLeaders(arr, n)) {
            System.out.print(x + " ");
        }
    }
}
