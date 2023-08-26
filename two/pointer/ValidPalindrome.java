package leet.code.two.pointer;

public class ValidPalindrome {
    public static boolean isPalindrome(String s) {
        int start = 0;
        s = s.replaceAll("[^a-zA-Z0-9]+", "").toLowerCase();
        int end = s.length() - 1;

        while (start <= end) {
            if (s.charAt(start) != s.charAt(end)) {
                return false;
            } else {
                start++;
                end--;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s));
    }
}