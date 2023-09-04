package leet.code.string;

public class LongestCommonPrefix {
    public static String longestCommonPrefix(String[] strs) {
        int minLen = Integer.MAX_VALUE;
        for (String str : strs) {
            minLen = Math.min(minLen, str.length());
        }

        StringBuilder commonPrefix = new StringBuilder();
        for (int i = 0; i < minLen; i++) {
            char currentChar = strs[0].charAt(i);
            for (String str : strs) {
                if (str.charAt(i) != currentChar) {
                    return commonPrefix.toString();
                }
            }
            commonPrefix.append(currentChar);
        }
        return commonPrefix.toString();
    }

    public static void main(String[] args) {
        String[] arr = new String[]{"cir", "car"};
        System.out.println(longestCommonPrefix(arr));
    }
}