package leet.code.data.conversion;

public class NumberSumInString {
    public static int getInteger(String s) {
        int i = 0;
        int result = 0;

        while (i < s.length()) {
            result = result * 10 + (s.charAt(i) - '0');
            i++;
        }
        return result;
    }

    public static void main(String[] args) {
        String[] s = "6add34fdf78gg9b0".split("\\D+");
        int sum = 0;
        int i = 0;

        while (i < s.length) {
            if ((String.valueOf(s[i])).matches("\\d+")) {
                sum = sum + getInteger(s[i]);
            }
            i++;
        }
        System.out.println(sum);
    }
}