package leet.code.string;

import java.util.Arrays;

public class Solution {

    public static void main(String[] args) {
        int[] nums = new int[]{32, 5, 65, 67, 57457, 884, 686, 865, 9, 985699, 5858, 3, 6, 26, 63, 8, 5858, 0};
        Arrays.stream(nums).sorted().filter(x -> x % 2 == 0).limit(5).forEach(x -> System.out.print(x + " "));
        System.out.println();
        Arrays.stream(nums).sorted().filter(x -> x % 2 == 0).limit(5).map(x -> x * x * x).forEach(x -> System.out.print(x + " "));
    }
}
