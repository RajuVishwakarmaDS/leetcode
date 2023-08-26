package leet.code.data.conversion;

public class ATOI {
    public static void main(String[] args) {
        String num = "324";
        int i = 0;
        int result = 0;

        while (i < num.length()) {
            result = result * 10 + (num.charAt(i) - '0');
            i++;
        }
        System.out.println(result);
    }
}