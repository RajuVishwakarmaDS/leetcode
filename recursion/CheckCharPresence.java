package leet.code.recursion;

public class CheckCharPresence {
    public static boolean isPresent(String s, char c, int idx) {
        if (s.length() == idx) {
            return false;
        }

        if (s.charAt(idx) == c) {
            return true;
        }

        return isPresent(s, c, idx + 1);
    }

    public static void main(String[] args) {
        String s = "raju vishwakarma";
        char c = 'a';
        System.out.println(isPresent(s, c, 0));
    }
}