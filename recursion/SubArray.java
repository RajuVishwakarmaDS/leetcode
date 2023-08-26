package leet.code.recursion;

public class SubArray {
    public static void getSubArray(int[] arr, int i) {
        if (i == arr.length) {
            slow_pointer++;
            i = slow_pointer;
            ans = "";
            getSubArray(arr, i);
        } else {
            if (i < arr.length) {
                ans = ans + arr[i] + " ";
                System.out.println(ans);
                getSubArray(arr, i + 1);
            }
        }
    }

    static int slow_pointer = 0;
    static String ans = "";

    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5};
        getSubArray(arr, 0);
    }
}