package leet.code.string;

/**
 * Note: Time is circular in nature
 */

import java.util.ArrayList;

public class MinimumTimeDifference {
    public static int getMinutes(String s) {
        int hrs = Integer.parseInt(s.substring(0, 2));
        int min = Integer.parseInt(s.substring(s.length() - 2));
        return hrs * 60 + min;
    }

    public static int findMinDifference(ArrayList<String> timePoints) {
        ArrayList<Integer> inMinutes = new ArrayList<>();
        for (String s : timePoints) {
            inMinutes.add(getMinutes(s));
        }
        inMinutes.sort((a, b) -> a >= b ? 1 : -1);
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < inMinutes.size() - 1; i++) {
            int diff = Math.abs(inMinutes.get(i) - inMinutes.get(i + 1));
            min = Math.min(diff, min);
        }
        int lastDiff = (inMinutes.get(0) + 1440) - inMinutes.get(inMinutes.size() - 1);
        return Math.min(lastDiff, min);
    }

    public static void main(String[] args) {
        ArrayList<String> lst = new ArrayList<>();
        lst.add("12:12");
        lst.add("00:13");
        System.out.println(findMinDifference(lst));
    }
}