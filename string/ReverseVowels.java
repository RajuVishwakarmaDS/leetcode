package leet.code.string;

public class ReverseVowels {
    public static String reverseVowels(String s) {
        int start = 0;
        int end = s.length() - 1;
        StringBuilder sb = new StringBuilder(s);

        while (start <= end) {
            boolean match1 = "aeiouAEIOU".indexOf(sb.charAt(start)) > -1;
            boolean match2 = "aeiouAEIOU".indexOf(sb.charAt(end)) > -1;
            if (match1 && match2) {
                char temp = sb.charAt(start);
                sb.replace(start, start + 1, String.valueOf(sb.charAt(end)));
                sb.replace(end, end + 1, String.valueOf(temp));
                start++;
                end--;
            } else if (match1 && !match2) {
                end--;
            } else {
                start++;
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String str = "Sore was I ere I saw Eros.";
        //   SorE was I ere I saw eros.
        System.out.println(reverseVowels(str));
    }
}