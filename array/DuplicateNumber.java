package leet.code.array;

public class DuplicateNumber {
    public static int findDuplicate(int[] nums) {
        int[] temp = new int[nums.length];
        for (int num : nums) {
            if (temp[num] != num) {
                temp[num] = num;
            } else {
                return num;
            }
        }
        return temp[0];
    }

    public static void main(String[] args) {
        int[] arr = new int[]{3, 1, 3, 4, 2};
        System.out.println(findDuplicate(arr));
    }
}