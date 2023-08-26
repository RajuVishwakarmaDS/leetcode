package leet.code.string;

public class SortingSentence {
    public static String sortSentence(String s) {
        String []arr = s.split("\\s+");
        String []ans = new String[arr.length];
        for(String str:arr){
            int idx = Integer.parseInt(str.replaceAll("\\D+", ""));
            ans[idx-1] = str.replaceAll("\\d+", "");
        }
        return String.join(" ",ans);
    }

    public static void main(String[] args) {
        String s = "is2 sentence4 This1 a3";
        System.out.println(sortSentence(s));
    }
}
