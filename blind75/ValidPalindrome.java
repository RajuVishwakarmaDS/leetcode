package leet.code.blind75;

public class ValidPalindrome {
    public static boolean isPalindrome(String s) {
        s = s.toLowerCase();
        int n = s.length() - 1;
        int i = 0;
        int j = n;
        while (i <= j) {
            if (!Character.isLetterOrDigit(s.charAt(i))) {
                i++;
            } else if (!Character.isLetterOrDigit(s.charAt(j))) {
                j--;
            } else {
                if (s.charAt(i) != s.charAt(j)) {
                    return false;
                }
                i++;
                j--;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "0P";
        System.out.println(isPalindrome(str));
    }
}
