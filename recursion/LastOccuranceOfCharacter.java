package leet.code.recursion;

public class LastOccuranceOfCharacter {
    public static int getLastOccurance(String s, char target, int i) {
        if (i < 0) {
            return -1;
        }

        if (s.charAt(i) == target) {
            return i;
        }
        return getLastOccurance(s, target, i-1);
    }

    public static void main(String[] args) {
        String s = "sfvdfbdvsdvdsvbdgbfv";
        char target = 'b';
        System.out.println(getLastOccurance(s, target, s.length() - 1));
    }
}