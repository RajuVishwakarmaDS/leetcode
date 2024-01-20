package leet.code.binarysearch;

public class test {
    public static int get(int num){
        int x = 0;
        int y = 1;
        while (num>0){
            x = x+y;
            System.out.print(num+" ");
            y++;
            return num+get(num-x);
        }
        return num;
    }
    public static void main(String[] args) {

    }
}
