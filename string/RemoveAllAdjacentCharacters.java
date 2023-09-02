package leet.code.string;

public class RemoveAllAdjacentCharacters {
    public static void main(String[] args) {
        String str = "abbaca";
        int i = 0;
        int n = str.length();
        StringBuilder ans = new StringBuilder();

        while (i < n) {
            char current_ch = str.charAt(i);
            if (!ans.isEmpty() && current_ch == ans.charAt(ans.length() - 1)) {
                ans = new StringBuilder(ans.substring(0, ans.length()-1));
            } else {
                ans.append(str.charAt(i));
            }
            i++;
        }
        System.out.println(ans);
    }
}