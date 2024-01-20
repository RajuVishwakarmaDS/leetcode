package leet.code.binarysearch;

import java.util.Arrays;
import java.util.Map;

public class Practise {
    public static int firstOccurance(int[] arr, int key) {
        int start = 0;
        int end = arr.length - 1;
        int mid = end - (end - start) / 2;
        int found = -1;

        while (start <= end) {
            if (arr[mid] == key) {
                found = mid;
                end = mid - 1;
            } else if (arr[mid] > key) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
            mid = end - (end - start) / 2;
        }
        return found;
    }

    public static int lastOccurance(int[] arr, int key) {
        int start = 0;
        int end = arr.length - 1;
        int mid = end - (end - start) / 2;
        int found = 0;

        while (start <= end) {
            if (arr[mid] == key) {
                found = mid;
                start = mid + 1;
            } else if (arr[mid] > key) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
            mid = end - (end - start) / 2;
        }
        return found;
    }


    public static int totalOccurance(int[] arr, int key) {
        return lastOccurance(arr, key) - firstOccurance(arr, key) + 1;
    }

    public static int getPeakElementInMountain(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        int mid = end - (end - start) / 2;

        while (start < end) {
            if (arr[mid] > arr[mid - 1]) {
                start = mid;
            } else {
                end = mid - 1;
            }
            mid = end - (end - start) / 2;
        }
        return start;
    }

    public static int getPivot(int[] arr) {
        int len = arr.length;
        int fullSum = 0;
        for (int j : arr) {
            fullSum += j;
        }
        int leftSum = 0;
        int rightSum;

        for (int i = 0; i < len; i++) {
            if (i > 0) {
                leftSum += arr[i - 1];
            }
            rightSum = fullSum - (leftSum + arr[i]);
            if (leftSum == rightSum) {
                return i;
            }
        }
        return -1;
    }

    static int getIndexInSortedArray(int[] arr, int key) {
        int pivot = arr.length - getPivotElement(arr);
        int start = 0;
        int end = arr.length - 1;

        if (key >= arr[pivot] && key <= arr[end]) {
            start = pivot;
        } else {
            end = pivot - 1;
        }

        int mid = end - (end - start) / 2;

        while (start <= end) {
            if (arr[mid] == key) {
                return mid;
            } else if (arr[mid] > key) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
            mid = end - (end - start) / 2;
        }
        return -1;
    }

    public static int getPivotElement(int[] arr) {
        int start = 0;
        int end = arr.length;
        int mid = end - (end - start) / 2;

        while (start <= mid) {
            if (mid > 1 && mid < end) {
                if (arr[mid] > arr[mid + 1]) {
                    return mid;
                }

                if (arr[mid - 1] > arr[mid]) {
                    return mid - 1;
                }

                if (arr[mid - 1] < arr[mid]) {
                    start = mid;
                } else {
                    end = mid - 1;
                }
            }
            mid = end - (end - start) / 2;
        }
        return 0;
    }

    public static int getCuttingHeight(int[] trees, int len) {
        int start = len;
        int end = Arrays.stream(trees).max().getAsInt();
        int mid = end - (end - start) / 2;

        while (start <= end) {
            int cutted = getCuttedWoodLength(trees, mid);
            if (len == cutted) {
                return mid;
            } else if (len > cutted) {
                end = mid - 1;
            } else {
                start = start + 1;
            }
            mid = end - (end - start) / 2;
        }
        return -1;
    }

    public static int getCuttedWoodLength(int[] trees, int mid) {
        return Arrays.stream(trees).filter(x -> x - mid > 0).reduce(0, (ans, x) -> ans + (x - mid));
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 3, 4, 4, 4, 6, 7, 9, 13};
        System.out.println("first occurance: " + firstOccurance(arr, 3));
        System.out.println("last occurance: " + lastOccurance(arr, 4));
        System.out.println("total occurance: " + totalOccurance(arr, 4));

        int[] mountainArray = new int[]{0, 1};
        System.out.println("peak element: " + getPeakElementInMountain(mountainArray));

        int[] pivotArray = new int[]{1, 7, 3, 6, 5, 6};
        System.out.println("pivot element: " + getPivot(pivotArray));

        int[] rotatedSortedArray = new int[]{1, 2, 5};
//        System.out.println("index in rotated sorted array: " + getIndexInSortedArray(rotatedSortedArray, 6));

        int[] trees = new int[]{20, 15, 10, 17};
        System.out.println("Machine height: " + getCuttingHeight(trees, 7));
    }
}
