package leet.code.sorting;

public class QuickSort {
    static int[] arr = {6, 5, 8, 9, 3, 10, 15, 12, 16, -1, Integer.MAX_VALUE};
    static int pivot = 0;

    public static int partition(int low, int high) {
        int i = low;
        int j = high;
        pivot = arr[low];

        while (i <= j) {
            do {
                i++;
            } while (arr[i] <= pivot);

            do {
                j--;
            } while (arr[j] > pivot);

            if (i < j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        arr[low] = arr[j];
        arr[j] = pivot;
        return j;
    }

    public static void quickSort(int low, int high) {
        if (low < high) {
            int j = partition(low, high);
            quickSort(low, j);
            quickSort(j + 1, high);
        }
    }

    public static void main(String[] args) {
        quickSort(0, arr.length - 1);

        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
}
