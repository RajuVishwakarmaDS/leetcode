package leet.code.two.pointer;

public class ExtremePrints {
    public static void main(String[] args) {
        int []arr = new int[]{1,2,3,4,5,6,7,8,9};
        int start = 0;
        int end = arr.length-1;

        while (start<=end){
            if (start==end){
                System.out.print(arr[start]+" ");
                break;
            }
            else {
                System.out.print(arr[start]+" ");
                start++;
                System.out.print(arr[end]+" ");
                end--;
            }
        }
    }
}
