package leet.code.array;

public class CheckArrayIsSorted {

    /**
     * This method checks if array is sorted or not
     * @param nums: array containing numbers
     * @return true if array is sorted else returns false
     */
    public static boolean check(int[] nums) {
        int len = nums.length;
        int i = 0;
        int idx = (nums[i]+i)%len;
        while (i<len){
            int temp = nums[0];
            nums[0] = nums[idx+i];
            nums[idx+i] = temp;
            i++;
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {3, 4, 5, 1};
        System.out.println(check(arr));
    }
}