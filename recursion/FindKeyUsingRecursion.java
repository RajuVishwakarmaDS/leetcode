package leet.code.recursion;

public class FindKeyUsingRecursion {
    public static int getIndex(int []arr, int idx, int key){
        if (idx > arr.length-1){
            return -1;
        }
        if (arr[idx] == key){
            return idx;
        }

        return getIndex(arr, idx+1, key);
    }
    public static void main(String[] args) {
        int[] arr = new int[]{6, 8, 5, 3, 9, 0, 1};
        int key = 101;
        System.out.println(getIndex(arr, 0, key));
    }
}