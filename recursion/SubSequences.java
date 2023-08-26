package leet.code.recursion;

public class SubSequences {
    public static void getSubsequence(String str, int i, String output){
        if (i == str.length()){
            return;
        }

        getSubsequence(str, i+1, output);
        output = output+str.charAt(i);
        System.out.println(output);
        getSubsequence(str, i+1, output);
    }

    static String output = "";
    public static void main(String[] args) {
        String str = "xyz";
        getSubsequence(str, 0, output);
    }
}