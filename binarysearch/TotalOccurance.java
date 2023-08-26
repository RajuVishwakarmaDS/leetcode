package leet.code.binarysearch;

public class TotalOccurance {
    public static int getOccuranceCount(int[] arr, int size, int target) {
        return LastOccurance.getLastOccurance(arr, size, target) - FirstOccurance.getFirstOccurance(arr, size, target) + 1;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{2, 4, 4, 4, 4, 4, 4, 6, 8, 10};
        int size = arr.length;
        int target = 4;

        System.out.printf("%d occured %d times", target, getOccuranceCount(arr, size, target));
    }
}
