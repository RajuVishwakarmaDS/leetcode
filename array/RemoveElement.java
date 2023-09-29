package leet.code.array;

import java.util.Arrays;

public class RemoveElement {
    public static void inplaceReplace(int []arr, int i) {
        int start = i;
        int n = arr.length;
        while (start < n - 1) {
            if (arr[++start] != arr[i]) {
                int temp = arr[start];
                arr[start] = arr[i];
                arr[i] = temp;
                break;
            }
        }
    }

    public static int removeDuplicates(int[] nums, int key) {
        int n = nums.length;
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] == key) {
                inplaceReplace(nums, i);
            }
        }

        for (int i = 0; i < n; i++) {
            if (nums[i] != key) {
                cnt++;
            }
        }

        return cnt;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{0, 1, 2, 2, 3, 0, 4, 2};
        // [0,1,4,0,3,_,_,_]
        int key = 2;
        System.out.println(removeDuplicates(arr, key));
        Arrays.stream(arr).forEach(x -> System.out.print(x + " "));
    }
}