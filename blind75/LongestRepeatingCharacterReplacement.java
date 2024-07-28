package leet.code.blind75;

public class LongestRepeatingCharacterReplacement {
    public static int characterReplacement(String s, int k) {
        int max = 0;
        int i = 0;
        int j = 1;
        int n = s.length();
        int replacementCount = 0;
        while (i < n && j < n) {
            if (replacementCount <= k) {
                if (s.charAt(i) != s.charAt(j)) {
                    replacementCount ++;
                }
                max = Math.max(max, j - i + 1);
                j++;
            } else {
                replacementCount = 0;
                i++;
                j = i + 1;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        String s = "ABBB";
        int k = 2;
        System.out.println(characterReplacement(s, k));
    }
}
