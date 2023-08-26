package leet.code.recursion;

public class RemoveAllOccurancesOfString {
    public static String removeOccurrences(String s, String part) {
        if (!s.contains(part)) {
            return s;
        } else {
            int i = s.indexOf(part);
            s = s.substring(0, i) + s.substring(i + part.length());
            return removeOccurrences(s, part);
        }
    }

    public static void main(String[] args) {
        String str = "axxxxyyyyb";
        String part = "xy";
        System.out.println(removeOccurrences(str, part));
    }
}