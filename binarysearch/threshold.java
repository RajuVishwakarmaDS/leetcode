package leet.code.binarysearch;

import javax.imageio.stream.ImageInputStream;
import java.util.Arrays;

public class threshold {
    public static int sum(int mid ,int[] arr){
        int ans =0;
        for(int i=0;i<arr.length;i++){
            ans =ans + (int)Math.ceil((double)arr[i]/(double) mid);
        }
        return ans;
    }
    static public int smallestDivisor(int[] arr, int th) {
        Arrays.sort(arr);
        int start = 1;
        int end = arr[arr.length - 1];
        int ans = 0;
        int m=0;
        while (start <= end) {
            int mid = (start + end) / 2;
            int s =sum(mid, arr);
            if (s <= th) {
                if (ans <= sum(mid, arr)) {
                    ans = sum(mid,arr);
                    m=mid;
                }
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }


        return m;

    }

    public static void main(String[] args) {
        int[] arr ={200,100,14};
        int th =10;
        System.out.println(smallestDivisor(arr,th));
    }
}
