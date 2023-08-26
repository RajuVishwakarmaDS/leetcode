package leet.code.binarysearch;

public class pivot {
    public static int getMin(int []arr){
        int pivot = getPivot(arr);

        if (pivot == 0){
            return arr[0];
        }else {
            return arr[pivot+1];
        }
    }
    public static int getPivot(int []arr){
        int start = 0;
        int end = arr.length;
        int pivot = 0;
        int mid = 0;
        while (start <= end) {
            mid = (start + end) / 2;

            if (mid > 0 && arr[mid - 1] <= arr[mid] && mid < arr.length - 1 && arr[mid + 1] < arr[mid]) {
                pivot = arr[mid];
                break;
            } else if (mid == 0 && arr[mid + 1] < arr[mid]) {
                pivot = mid;
                end = mid - 1;
            } else if (mid == arr.length - 1 && arr[mid - 1] > arr[mid]) {
                pivot = mid;
                start = mid + 1;
            } else if (arr[mid] > arr[arr.length - 1]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return mid;
    }

    public static void main(String[] args) {
        int[] arr = {5, 2};
        System.out.println(getMin(arr));
    }
}