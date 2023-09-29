package leet.code.leet.code.backtracking;

public class StringPermutation {
    public static String swap(String str, int i, int j) {
        StringBuilder sb = new StringBuilder(str);
        char temp = sb.charAt(i);
        sb.setCharAt(i, sb.charAt(j));
        sb.setCharAt(j, temp);
        return sb.toString();
    }

    public static void getCombo(String str, int i) {
        if (i >= str.length()) {
            System.out.print(str+" ");
            return;
        }

        for (int j = i; j < str.length(); j++) {
            str = swap(str, i, j);
            getCombo(str, i + 1);
            str = swap(str, i, j);
        }
    }

    public static void main(String[] args) {
        String str = "abcde";
        getCombo(str, 0);
    }
}