package leet.code.array;

public class DuplicateNumber {
    public static int findDuplicate(int[] nums) {
        while (nums[0] != nums[nums[0]]) {
            int temp = nums[0];
            nums[0] = nums[nums[0]];
            nums[temp] = temp;
        }
        return nums[0];
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 3, 4, 2, 2};
        System.out.println(findDuplicate(arr));
    }
}