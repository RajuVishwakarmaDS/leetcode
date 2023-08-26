package leet.code.string;

public class LengthOfLastWord {
    public static int lengthOfLastWord(String str) {
        int cnt = 0;
        int i = str.length();
        while (i - 1 >= 0) {
            if (String.valueOf(str.charAt(i - 1)).matches("[a-zA-Z'']")){
                cnt++;
            }
            i--;
        }
        return cnt;
    }

    public static void main(String[] args) {
        String str = "y";
        int cnt = lengthOfLastWord(str);
        System.out.println(cnt);
    }
}