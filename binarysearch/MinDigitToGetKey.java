
package leet.code.binarysearch;

public class MinDigitToGetKey {

    public static int getans(int[] arr,int target){
        if(target==0){
            return 0;
        }
        if(target<0){
            return Integer.MAX_VALUE;
        }
        int min=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            int ans = getans(arr,target-arr[i]);
            if(ans!=Integer.MAX_VALUE){
                min =Math.min(min,ans+1);
            }

        }
        return min;
    }

    static int cnt = 0;
    public static void main(String[] args){
        int[] arr ={1,2,3};
        int target =3;

        System.out.print(getans(arr,target));

    }
}