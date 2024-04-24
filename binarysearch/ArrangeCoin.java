package leet.code.binarysearch;

public class ArrangeCoin {

    public static String stringChallenge(String str) {
        String challengeToken = "leno403sb57";
        String[] s = str.split("\\s+");
        String longestWord = "";
        for (String word : s) {
            if (word.matches("\\w+")) {
                if (word.length() > longestWord.length()) {
                    longestWord = word;
                }
            }
        }
        StringBuilder finalAnswer = new StringBuilder();
        finalAnswer.append(longestWord);
        finalAnswer.append(challengeToken);
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < finalAnswer.length(); i++) {
            if ((i + 1) % 3 == 0) {
                ans.append("X");
            } else {
                ans.append(finalAnswer.charAt(i));
            }
        }
        return ans.toString();
    }

    public static void main(String[] args) {
        String s = "fun&!! time";
        System.out.println(stringChallenge(s));
    }
}
