package leet.code.string;

import java.util.ArrayList;
import java.util.Comparator;

public class LargestNumber {
    public static String largestNumber(int[] nums) {
        ArrayList<Integer> lst = new ArrayList<>();
        for (int i : nums) {
            lst.add(i);
        }

        Comparator<Integer> comp = (a, b) -> {
            String num1 = "" + a + b;
            String num2 = "" + b + a;

            if (num1.compareTo(num2) < 0) {
                return 1;
            } else {
                return -1;
            }
        };
        lst.sort(comp);

        String ans = "";
        for (int s : lst) {
            ans = ans + s;
        }

        if (ans.charAt(0) == '0') {
            return "0";
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {1000000000, 1000000000};
        System.out.println(largestNumber(arr));
    }
}