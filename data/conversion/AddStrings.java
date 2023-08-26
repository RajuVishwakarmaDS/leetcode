package leet.code.data.conversion;

public class AddStrings {
    public static String addStrings(String num1, String num2) {
        int n1 = num1.length();
        int n2 = num2.length();
        int n = Math.max(n1, n2);
        String result = "";
        int carry = 0;
        int i = 1;

        int intermediate_ans = 0;
        while (n - i >= 0) {
            int a;
            int b;
            if (i <= n1) {
                a = num1.charAt(n1 - i) - '0';
            } else {
                a = 0;
            }

            if (i <= n2) {
                b = num2.charAt(n2 - i) - '0';
            } else {
                b = 0;
            }

            intermediate_ans = a + b + carry;
            if (intermediate_ans >= 10) {
                carry = intermediate_ans / 10;
                result = "" + (intermediate_ans % 10) + result;
            } else {
                result = "" + (intermediate_ans % 10) + result;
                carry = 0;
            }
            i++;
        }

        if (carry != 0 && intermediate_ans >= 10) {
            return carry + result;
        }
        return result;
    }

    public static void main(String[] args) {
        String s1 = "1";
        String s2 = "9";
        System.out.println(addStrings(s1, s2));
    }
}