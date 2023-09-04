package leet.code.string;

public class ReverseOnlyLetter {
    public static String reverseOnlyLetters(String s) {
        StringBuilder sb = new StringBuilder(s);
        int end = s.length() - 1;
        int start = 0;

        while (start <= end) {
            if (Character.isLetter(sb.charAt(start)) && Character.isLetter(sb.charAt(end))) {
                char temp = sb.charAt(start);
                sb.replace(start, start + 1, String.valueOf(sb.charAt(end)));
                sb.replace(end, end + 1, String.valueOf(temp));
                start++;
                end--;
            } else if (Character.isLetter(sb.charAt(start)) && !Character.isLetter(sb.charAt(end))) {
                end--;
            } else {
                start++;
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String s = "Test1ng-Leet=code-Q!";
        System.out.println(reverseOnlyLetters(s));
    }
}