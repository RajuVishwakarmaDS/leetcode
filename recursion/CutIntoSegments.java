package leet.code.recursion;

public class CutIntoSegments {

    public static int getMaxSegments(int[] arr, int len) {
        if (len == 0) {
            return 0;
        }

        if (len < 0) {
            return Integer.MIN_VALUE;
        }

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            int ans = getMaxSegments(arr, len - arr[i]);

            if (ans != Integer.MIN_VALUE) {
                max = Math.max(max, ans + 1);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{5, 3, 3};
        int len = 2;
        if (getMaxSegments(arr, len) < 0) {
            System.out.println(0);
        } else {
            System.out.println(getMaxSegments(arr, len));
        }
    }
}