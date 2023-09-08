package leet.code.string;

public class ATOI {
    public static int myAtoi(String s) {
        StringBuilder sb = new StringBuilder(s.trim());
        StringBuilder ans = new StringBuilder();
        int n = sb.length();

        if (n == 0) {
            return 0;
        } else {
            if ((sb.charAt(0) != '-' || sb.charAt(0) == '+') && !Character.isDigit(sb.charAt(1))) {
                return 0;
            }

            for (int i = 0; i < n; i++) {
                char ch = sb.charAt(i);
                if (i > 0 && (ch == '-' || ch == '+') && (sb.charAt(i - 1) == '-' || sb.charAt(i - 1) == '+')) {
                    return 0;
                }

                if ((ch - '0' > 0 && ch - '0' <= 9) || ch == '.' || ch == '-' || ch == '+') {
                    ans.append(ch);
                }
            }

            if (ans.length() < 2 && (ans.charAt(0) == '-' || ans.charAt(0) == '+')) {
                return 0;
            }

            if (ans.charAt(0) == '+'){
                ans = new StringBuilder(ans.substring(1));
            }

            try {
                return (int) Double.parseDouble(ans.toString());
            } catch (NumberFormatException e) {
                if (ans.charAt(0) == '-') {
                    return Integer.MIN_VALUE;
                } else {
                    return Integer.MAX_VALUE;
                }
            }
        }
    }

    public static void main(String[] args) {
        String str = "3.14159";
        System.out.println(myAtoi(str));
    }
}