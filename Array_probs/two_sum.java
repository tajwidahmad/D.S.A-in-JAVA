package Array_probs;

import java.util.Arrays;

public class two_sum {

    public static void main(String[] args) {
        int arr[]={-1,-2,-3,-4,-5};
        int target=-8;
        System.out.println(Arrays.toString(pair_sum(arr, target)));

    }
    public static int[] pair_sum(int arr[],int target) {
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if (arr[i]+arr[j]==target) {
                    int[] ans = {arr[i],arr[j]};
                    return ans;
                }
            }
        }
        int[] ans ={-1,-1};
        return ans;
    }
}