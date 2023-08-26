package leet.code.string;

public class IndexOfFirstOccuranceInString {
    public static int strStr(String haystack, String needle) {
        int i = 0;
        int l = needle.length();
        int n = haystack.length();

        while (i <= n-l) {
            if (haystack.substring(i, i + l).equals(needle)) {
                return i;
            } else {
                i++;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String s = "a";
        String str = "a";
        int idx = strStr(s, str);
        System.out.println(idx);
    }
}