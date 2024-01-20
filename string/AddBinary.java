package leet.code.string;

public class AddBinary {
    public static String addBinary(String a, String b) {
        int idx_a = a.length() - 1;
        int idx_b = b.length() - 1;
        int carry = 0;
        StringBuilder ans = new StringBuilder();
        while (true) {
            int val1 = 0;
            int val2 = 0;
            if (idx_a < 0 && idx_b < 0) {
                break;
            } else {
                if (idx_a < 0) {
                    val1 += 0;
                } else {
                    val1 += Integer.parseInt(String.valueOf(a.charAt(idx_a)));
                }
                if (idx_b < 0) {
                    val2 += 0;
                } else {
                    val2 += Integer.parseInt(String.valueOf(b.charAt(idx_b)));
                }
            }
            if (val1 + val2 + carry == 3) {
                ans.append("1");
                carry = 1;
            } else if (val1 + val2 + carry == 2) {
                ans.append("0");
                carry = 1;
            } else if (val1 + val2 + carry == 1) {
                ans.append("1");
            } else if (val1 + val2 + carry == 0) {
                ans.append("0");
            }
            idx_a--;
            idx_b--;
        }
        if (carry != 0) {
            return ans.append(carry).reverse().toString();
        } else {
            return ans.reverse().toString();
        }
    }

    public static void main(String[] args) {
        String a = "1010";
        String b = "1011";
        System.out.println(addBinary(a, b));
    }
}
