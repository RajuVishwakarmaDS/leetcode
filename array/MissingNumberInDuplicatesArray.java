package leet.code.array;

public class MissingNumberInDuplicatesArray {
    public static int findDuplicate(int[] nums) {
        int[] temp = new int[nums.length];
        for (int num : nums) {
            if (num < nums.length) {
                temp[num] = num;
            }
        }

        for (int i = 1; i < nums.length; i++) {
            if (temp[i] == 0) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{4, 3, 6, 2, 1, 1};
        System.out.println(findDuplicate(arr));
    }
}
