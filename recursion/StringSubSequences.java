package leet.code.recursion;

public class StringSubSequences {
    static int max = -1;
    static String ans = null;

    public static void getSubsequences(String s, String output, int i) {
        if (s.length() == 1) {
            ans = ans + s.charAt(0);
        } else {
            if (i >= s.length()) {
                if (!output.isBlank() && output.length() > 1) {
                    StringBuilder sb = new StringBuilder(output);
                    if (sb.reverse().toString().equals(output) && output.length() >= max) {
                        max = output.length();
                        ans = output;
                    }
                }
                return;
            }

            // exclude case
            getSubsequences(s, output, i + 1);

            // include case
            output = output + s.charAt(i);
            getSubsequences(s, output, i + 1);
        }
    }

    public static void main(String[] args) {
        String[] str = {"babad", "cbbd"};
        String output = "";
        int i = 0;
        for (String s : str) {
            getSubsequences(s, output, i);
            System.out.println(ans);
            max = -1;
            ans = null;
        }
    }
}