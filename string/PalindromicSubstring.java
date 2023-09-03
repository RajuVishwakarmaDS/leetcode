package leet.code.string;

public class PalindromicSubstring {
    public static int expandAroundIndex(String s, int i, int j) {
        int count = 0;

        while (i >= 0 && j < s.length() && s.charAt(i) == s.charAt(j)) {
            count++;
            i--;
            j++;
        }
        return count;
    }

    public static int countSubstrings(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            int oddAns = expandAroundIndex(s, i, i);
            count = count + oddAns;

            int evenAns = expandAroundIndex(s, i, i + 1);
            count = count + evenAns;
        }
        return count;
    }

    public static void main(String[] args) {
        String s = "noon";
        System.out.println(countSubstrings(s));
    }
}