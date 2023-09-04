package leet.code.string;

public class SubstringPalindrome {
    public static int getPalindromeCount(String s, int i, int j) {
        int cnt = 0;

        while (i >= 0 && j < s.length() && s.charAt(i) == s.charAt(j)) {
            String sub = s.substring(i, j + 1);
            if (sub.length() > max) {
                max = Math.max(sub.length(), max);
                ans = sub;
            }
            cnt++;
            i--;
            j++;
        }
        return cnt;
    }

    public static int getSubPalCount(String str) {
        int cnt = 0;
        int len = str.length();

        for (int i = 0; i < len; i++) {
            int oddCnt = getPalindromeCount(str, i, i);
            cnt = cnt + oddCnt;

            int evenCnt = getPalindromeCount(str, i, i + 1);
            cnt = cnt + evenCnt;
        }
        return cnt;
    }

    static String ans = "";
    static int max = Integer.MIN_VALUE;

    public static void main(String[] args) {
        String str = "noon";
        System.out.println(getSubPalCount(str));
        System.out.println(ans);
    }
}