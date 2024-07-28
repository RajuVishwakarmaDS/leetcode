package leet.code.blind75;

public class ValidAnagram {
    public static boolean isAnagram(String s, String t) {
        int[] chars = new int[26];
        int n = s.length();

        if (s.length() != t.length()) {
            return false;
        } else {
            for (int i = 0; i < n; i++) {
                chars[s.charAt(i) - 'a'] += 1;
                chars[t.charAt(i) - 'a'] -= 1;
            }

            for (int ch : chars) {
                if (ch != 0) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "a";
        String t = "ab";
        System.out.println(isAnagram(s, t));
    }
}