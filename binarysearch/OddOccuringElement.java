package leet.code.binarysearch;

public class OddOccuringElement {
    public static int getOddOccuringElement(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        int mid = (start + end) / 2;

        while (start <= end) {
            if (start == end) {
                return arr[start];
            }

            if (mid > 0 && mid < end && mid % 2 == 0) {
                if (arr[mid] == arr[mid + 1]) {
                    start = mid + 1;
                } else{
                    end = mid - 1;
                }
            }

            if (mid > 0 && mid < end && mid % 2 != 0) {
                if (arr[mid] == arr[mid - 1]) {
                    start = mid + 1;
                } else{
                    end = mid - 1;
                }
            }

            mid = (start + end) / 2;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{5,5,1, 1, 2, 2, 3, 3, 4, 4, 3,3, 6, 6, 600, 600, 4, 4, 7};
        int elem = getOddOccuringElement(arr);
        System.out.println(elem);
    }
}