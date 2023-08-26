package leet.code.array;

import java.util.ArrayList;
import java.util.Arrays;

public class PlusOne {
    public static int[] plusOne(int[] digits) {
        int n = digits.length - 1;
        int i = 0;
        int intermediate = 0;
        while (i >= 0 && n - i >= 0) {
            int ans = digits[n - i] + 1;
            if (ans >= 10) {
                digits[n - i] = ans % 10;
                ans = ans / 10;
                intermediate = ans;
            } else {
                digits[n - i] += 1;
                break;
            }
            i++;
        }

        if (digits[0] == 0) {
            int[] arr = new int[n + 2];
            arr[0] = intermediate;
            for (int j = 1; j < n; j++) {
                arr[j] = digits[j - 1];
            }
            return arr;
        } else {
            return digits;
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[]{9, 9, 9};
        Arrays.stream(plusOne(arr)).forEach(x -> System.out.print(x + " "));
    }
}