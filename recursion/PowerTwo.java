package leet.code.recursion;

public class PowerTwo {
    public static int getPower(int power) {
        if (power == 0) {
            return 1;
        }

        return 2 * getPower(power - 1);
    }

    public static void main(String[] args) {
        int power = 5;
        System.out.println(getPower(power));
    }
}