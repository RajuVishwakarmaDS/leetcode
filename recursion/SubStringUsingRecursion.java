package leet.code.recursion;

public class SubStringUsingRecursion {
    public static void getSubStrings(String s, int start, int end) {
        if (start == end) {
            st++;
            start = st;
            output = "";
            getSubStrings(s, start, end);
        } else {
            if (start < end) {
                output = output + s.charAt(start);
                System.out.println(output);
                getSubStrings(s, start + 1, end);
            }
        }
    }

    static int st = 0;
    static String output = "";

    public static void main(String[] args) {
        String s = "raju";
        getSubStrings(s, 0, s.length());
    }
}